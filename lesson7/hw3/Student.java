package lesson7.hw3;

import java.util.Comparator;

public class Student {

	private String name;
	private Integer course;
	static CompareByName comByName = new CompareByName();
	static CompareByCourse comByCour = new CompareByCourse();
	
	public static CompareByName getComByName() {
		return comByName;
	}

	public static CompareByCourse getComByCour() {
		return comByCour;
	}

	public String getName() {
		return name;
	}
	
	public Integer getCourse() {
		return course;
	}
	
	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
	}

	public void printStudent() {
		System.out.println("Student: " + this.name + " course: " + this.course);
	}

	@Override
	public String toString() {
		return "Student name is " + name + " and his course is " + course;
	}
	
	static class CompareByName implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	
	static class CompareByCourse implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			if (!o1.getCourse().equals(o2.getCourse())) {
				return o1.getCourse() - o2.getCourse();
			} else {
				return o1.getName().compareTo(o2.getName());
			}			
		}
		
	}
	
	
}

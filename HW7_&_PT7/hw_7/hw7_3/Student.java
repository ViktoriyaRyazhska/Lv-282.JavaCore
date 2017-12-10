package hw7_3;

import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.Iterator;

public class Student implements Comparable {
	
	private String name;
	private int course;
	
	public Student() {
	}
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}

	public static void printStudents (List<Student> students, Integer course) {
		
		Iterator iterator = students.iterator();
		Student student = new Student();
		int flag = 0;
		
		while (iterator.hasNext()) {
			student = (Student) iterator.next();
			if(student.getCourse() == course) {
				System.out.println(student);
				flag = 1;
			}
		}
		if(flag == 0)
			System.out.println("Sorry. There aren`t students of this course");
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student	[Name: " + getName() + "	Course: " + getCourse() + "]";
	}
	
	@Override
	public int compareTo(Object arg0) {
		int compare = ((Student)arg0).getCourse();
		return this.course-compare;
	}
}

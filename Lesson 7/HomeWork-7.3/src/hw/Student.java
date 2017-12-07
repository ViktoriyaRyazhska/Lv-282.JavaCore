package hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Student implements CreatePerson {

	private static Random r = new Random();

	private String name;
	private int course;

	// standard constructor with fields
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	// constructor to create random Person
	public Student() {
		this.name = chooseRandomName(r);
		this.course = chooseRandomInt(r, 1, 5); // 1 - minValue of course, 5 - maxValue
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

	public static void printStudentsOnCourse(List<Student> list, int course) {
		System.out.println("List of Students on course " + course + ":");
		Iterator<Student> iter = list.iterator();   
		while (iter.hasNext()) {
			Student student = iter.next(); 
			
			/* is it necessary to create a new variable Student student = iter.next()? 
			 * iter.next() returns Student. Why we can't use it directly?
			 * 
			 * same question about Iterator. It is standard method of Collections. 
			 * Why we can't use list.iterator().hasNext() without creating Iterator instance? 
			*/

			if (student.getCourse() == course) {
				System.out.println(student.toString());
			}
		}
	}
	
	public static void printListInColumn(List<Student> list) {
		for (Student student : list) {
			System.out.println(student.toString());
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	
	// private Class + method to sort by name

	private static class CompareByName implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	public static List<Student> sortByName(List<Student> list) {
		list.sort(new CompareByName());
		System.out.println("List has been sorted by name");
		return list;
	}
	
	
	
	// private Class + method to sort by course

	private static class CompareByCourse implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}
	}

	public static List<Student> sortByCourse(List<Student> list) {
		list.sort(new CompareByCourse());
		System.out.println("List has been sorted by course");
		return list;
	}

}

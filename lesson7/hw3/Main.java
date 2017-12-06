package lesson7.hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		
		list.add(new Student("Harrison", 3));
		list.add(new Student("Brian", 1));
		list.add(new Student("Diana", 3));
		list.add(new Student("Carrol", 3));
		list.add(new Student("Andry", 2));
		list.add(new Student("Ferdinand", 1));
		list.add(new Student("Gamlet", 1));
		list.add(new Student("Ernest", 2));
		
		printAll(list);
		System.out.println();
		printOfCourse(list, 3);
		
		System.out.println("Sorted by name by course: ");
		list.sort(Student.getComByCour());
		printAll(list);
		
		System.out.println("Sorted by name: ");
		list.sort(Student.getComByName());
		printAll(list);
		
		
	}

	private static void printAll(List<Student> list) {
		Iterator<Student> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	private static void printOfCourse(List<Student> list, Integer course) {
		
		Iterator<Student> iterator = list.iterator();
		Student temp;
		System.out.println("On course no " + course + " studies next student:");
		while(iterator.hasNext()) {
			temp = iterator.next();
			if (temp.getCourse().equals(course)) {
				System.out.println(temp.getName());
			}
		}
		
	}
	
	
	
}


//Write class Student that provides information about the name of the student and his course.
//Class Student should consists of properties for access to these fields
//constructor with parameters
//method printStudents (List students, Integer course), which receives a list of students and the course number and prints to the console the names of the students from the list, which are taught in this course (use an iterator)


//methods to compare students by name and by course
//In the main() method 
//declare List students and add to the list five different students
//display the list of students ordered by name
//display the list of students ordered by course.

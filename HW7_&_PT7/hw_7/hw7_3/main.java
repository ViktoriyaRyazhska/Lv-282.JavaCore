package hw7_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {

		List<Student> student = new ArrayList<Student>();
		
		student.add(new Student("Vova",4));
		student.add(new Student("Vasya",3));
		student.add(new Student("Olga",3));
		student.add(new Student("Igor",2));
		student.add(new Student("Stepan",1));
		
		Student.printStudents(student, 5);
		
		Collections.sort(student);
		
		System.out.println("\nSorted by course:");		
		for(Student str: student){
			System.out.println(str);
	   }
	}

}

package example;

import java.text.DecimalFormat;

public class StudentMain {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.setName("Igor");
		st1.setRating(7);
		
		Student st2 = new Student("Petro");
		st2.setRating(11);
		
		Student st3 = new Student("Taras", 7);
		
		st1.changeRating(1);
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		System.out.println("Is " + st1.getName() + " better as " + st2.getName() + "? - " +st1.betterStudent(st2));
		System.out.println("Is " + st2.getName() + " better as " + st3.getName() + "? - " +st2.betterStudent(st3));
		System.out.println("Is " + st3.getName() + " better as " + st1.getName() + "? - " +st3.betterStudent(st1));
		
		DecimalFormat df = new DecimalFormat("0.000");
		
		System.out.println("There are " + Student.getCount() + " students");
		System.out.println("Total rating = " + Student.getSum());
		System.out.println("Average rating = " + df.format(Student.getAvgRating()));
		
		
	}

}

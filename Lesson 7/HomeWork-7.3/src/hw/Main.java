package hw;

import java.util.ArrayList;
import java.util.List;

public class Main extends Student {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		// add 10 automatically generated Students to list
		for (int i = 0; i < 10; i++) {
			list.add(new Student());
		}

		System.out.println("All Students:");
		printListInColumn(list);

		System.out.println();
		printStudentsOnCourse(list, 2);
		System.out.println();

		sortByName(list);
		printListInColumn(list);
		System.out.println();

		sortByCourse(list);
		printListInColumn(list);

	}

}

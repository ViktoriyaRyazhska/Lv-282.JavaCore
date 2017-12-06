package hw;

import java.util.HashSet;
import java.util.Set;

public class Main extends MySet {

	private static final int SIZE_OF_COLLECTION = 10;
	private static final int MAX_VALUE = 50; // maximum value of element in collection
	private static final int MIN_VALUE = -20; // minimum value of element in collection

	public static void main(String[] args) {

		/*
		 * All Sets are not parameterized
		 * We have method generateSet(), where we add automatically Integer elements to Set 
		 * There is no way, where another types can be added to this Sets
		 */

		Set set1 = new HashSet<>();
		generateSet(set1, SIZE_OF_COLLECTION, MAX_VALUE, MIN_VALUE);
		System.out.println("Set 1:");
		System.out.println(set1);
		System.out.println();

		Set set2 = new HashSet<>();
		generateSet(set2, SIZE_OF_COLLECTION, MAX_VALUE, MIN_VALUE);
		System.out.println("Set 2:");
		System.out.println(set2);
		System.out.println();

		System.out.println("United set:");
		System.out.println(union(set1, set2));
		System.out.println();

		System.out.println("Intersected set:");
		System.out.println(intersect(set1, set2));
		System.out.println();
	}

}

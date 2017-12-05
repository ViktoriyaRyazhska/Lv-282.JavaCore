package classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main extends MyCollection {

	private static final int SIZE_OF_COLLECTION = 10;
	private static final int MAX_VALUE = 50; //maximum value of element in collection
	private static final int MIN_VALUE = -20; //minimum value of element in collection

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> myCollection = new ArrayList<Integer>();
		
		//addElementsFromConsole(myCollection, SIZE_OF_COLLECTION, br);

		addRandomElements(myCollection, SIZE_OF_COLLECTION, MAX_VALUE, MIN_VALUE);

		System.out.println("My Collection:");
		System.out.println(myCollection);
		System.out.println();

		System.out.println("My Collection without elements, smaller as 5:");
		System.out.println(getListIfBigger(myCollection, 5));
		System.out.println();

		System.out.println("My Collection without elements, bigger as 20:");
		System.out.println(removeIfBigger(myCollection, 20));
		System.out.println();

		insertElement(myCollection, 1, 2);
		insertElement(myCollection, -3, 8);
		insertElement(myCollection, -4, 5);
		System.out.println("My Collection after modifications:");
		printCollection(myCollection);
		System.out.println();

		System.out.println(sortByValue(myCollection));

	}

}

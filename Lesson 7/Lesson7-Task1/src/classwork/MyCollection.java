package classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MyCollection {

	private static Random random = new Random();

	public static List<Integer> addRandomElements(List<Integer> collection, int size, int max, int min) {
		for (int i = 0; i < size; i++) {
			collection.add(random.nextInt(max - min) + min);
		}
		return collection;
	}

	public static List<Integer> addElementsFromConsole(List<Integer> collection, int size, BufferedReader br)
			throws NumberFormatException, IOException {

		System.out.println("Input " + size + " integer elements");
		for (int i = 0; i < size; i++) {
			collection.add(Integer.parseInt(br.readLine()));
		}
		return collection;
	}

	public static List<Integer> getListIfBigger(List<Integer> collection, int maxValue) {
		List<Integer> list = new ArrayList<Integer>();

		for (Integer integer : collection) {
			if (integer.intValue() > maxValue) {
				list.add(integer);
			}
		}
		return list;
	}

	public static List<Integer> removeIfBigger(List<Integer> collection, int maxValue) {

		List<Integer> collection2 = new ArrayList<Integer>();
		collection2.addAll(collection);

		Iterator<Integer> iterator = collection2.iterator();

		while (iterator.hasNext()) {
			if (iterator.next() > maxValue) {
				iterator.remove();
			}
		}
		return collection2;
	}

	public static List<Integer> insertElement(List<Integer> collection, int newValue, int index) {
		collection.set(index, newValue);
		return collection;
	}

	public static void printCollection(List<Integer> collection) {

		for (Integer element : collection) {
			System.out.println("position - " + collection.indexOf(element) + ", value of element - " + element);
		}
	}

	public static List<Integer> sortByValue(List<Integer> collection) {
		collection.sort(intComparator);
		System.out.println("Collection has been sorted by Value");
		return collection;
	}

	private static IntComparator intComparator = new IntComparator();

	private static class IntComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer arg0, Integer arg1) {
			return arg0 - arg1;
		}
	}

}

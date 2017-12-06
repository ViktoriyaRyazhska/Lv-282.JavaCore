package lesson7.p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PT1 {

	public static void main(String[] args) {
		
		List<Integer> myCollection = new LinkedList<Integer>(); 
		List<Integer> newCollection = new LinkedList<Integer>(); 
		
		myCollection = addInteger(10);
		System.out.println("My colection:");
		printList(myCollection);
		
		newCollection = positionOfMore(myCollection, 5);
		System.out.println("New colection:");
		printList(newCollection);
		
		removeOfMore(myCollection, 20);
		System.out.println("My colection after remowe of bigest from 20:");
		printList(myCollection);
		
		addToColection(myCollection, 2, 1);
		addToColection(myCollection, 8, -3); // ÿךשמ ג myCollection ןמחטצ³¿ ו ³סף÷ עמה³ המהא÷למ ג ך³םוצü  
		addToColection(myCollection, 5, -4);
		printInFormat(myCollection);
		
		myCollection.sort(new MyComparator());
		printList(myCollection);
		
	}
	
	
	private static List<Integer>addInteger(int n){
		List<Integer> list = new LinkedList<Integer>();
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			list.add(random.nextInt(50));
		}
		
		return list;
	}
	
	private static void printList(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "  ");
		}
		System.out.println();
	}
	
	private static List<Integer> positionOfMore(List<Integer> myList, int max) {
		
		List<Integer> newList = new ArrayList<Integer>();
		Iterator<Integer> iterator = myList.listIterator();
		Integer temp;
		int i = 0;
		
		while(iterator.hasNext()) {
			temp = iterator.next();
			if (temp > max) {
				newList.add(i);
			}
			i++;
		}
		return newList;
	}
	
	private static void removeOfMore(List<Integer> myCollection, int number) {
		Iterator<Integer> iterator = myCollection.iterator();
		
		while(iterator.hasNext()) {
			if (iterator.next()>number) {
				iterator.remove();
			}
		}
		
	}
	
	public static void addToColection(List<Integer> myCollection, int positin, int value) {
		
		if ( (myCollection.size() - 1) < positin ) {
			myCollection.add((myCollection.size()), value);
		}  else {
			myCollection.add(positin, value);
		}
		
	}
	
	public static void printInFormat(List<Integer> myCollection){
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
		}
		
	}
	
	private static class MyComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer a, Integer b) {
			return a - b;
		}
	} 
	
}



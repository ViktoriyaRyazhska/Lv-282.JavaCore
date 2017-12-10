import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Comparator;


public class main {
	
	static Random rand = new Random();
	
	public static void main(String[] args) {

		List<Integer> myCollection = new ArrayList<Integer>();
		List<Integer> myLinkedList = new LinkedList<Integer>();
		List<Integer> newCollection = new ArrayList<Integer>();
		
		fillRandIntCollection(myCollection, 10);
		System.out.println("myCollection elements:");
		System.out.println(myCollection);
		System.out.println("myCollection elements after inserting:");
		myCollection.add(2, 1);
		myCollection.add(5, -4);
		myCollection.add(8, -3);
		System.out.println(myCollection);
		
		System.out.println("newCollection elements:");
		fillIndexToCollection(myCollection, newCollection);
		System.out.println(newCollection);
		
		removeFromCollection(myCollection);
		System.out.println("myCollection elements after removing:");
		System.out.println(myCollection);
		
		Collections.sort(myCollection);
		System.out.println("myCollection after sorting:");
		System.out.println(myCollection);
		   
	}

	public static void fillRandIntCollection (List<Integer> numbers, int amount) {
		for (int i = 0; i < amount; i++) {
			numbers.add(rand.nextInt(40));
		}
	}
	
	public static void fillIndexToCollection (List<Integer> from, List<Integer> to) {
//		for (Integer integer : from) {
//			if (integer > 5) {
//				to.add(from.indexOf(integer) + 1);
//			}
//		}
		Iterator<Integer> iterator = from.iterator();
		   while(iterator.hasNext()){
		      if(iterator.next() > 5)
		    	  to.add(iterator.next());
		   }  
	}
	
	public static void removeFromCollection (List<Integer> numbers) {
		Iterator<Integer> iterator = numbers.iterator();
		   while(iterator.hasNext()){
		      if(iterator.next() > 20)
		    	  iterator.remove();
		   }  
	}
}

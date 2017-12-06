package lesson7.hw1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Set<Integer> set3 = new HashSet<Integer>();
		
		for (int i = 0; i < 20; i = i + 2) {
			set1.add(i);			
		} 
		
		for (int i = 0; i < 20; i = i + 3) {
			set2.add(i);			
		} 
	
		printSet(set1);
		printSet(set2);
		
	// first metod to union 	
		System.out.println("First uniun:");
		set3.addAll(set1);
		
		set3.addAll(set2);
		printSet(set3);
		set3.clear();
		
	// second metod to union 	
		System.out.println("My union:");
		set3 = union(set1, set2);
		printSet(set3);
		set3.clear();
		
		set3 = new HashSet<Integer>(set1); 
	
	// first metod intersect		
		System.out.println("Intersect:");
		set3.retainAll(set2);
		printSet(set3);
		
    // my intersect	
		System.out.println("My intersect:");
		set3.clear();
		intersect(set1, set2, set3);
		printSet(set3);
		
		
	}

	private static void printSet(Set<Integer> set) {
	
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "  ");
		}
		System.out.println();
		
	}

	private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> set3 = new HashSet<Integer>();
		Iterator<Integer> iterator = set1.iterator();
		while(iterator.hasNext()) {
			set3.add(iterator.next());
		}
		
		iterator = set2.iterator();
		while(iterator.hasNext()) {
			set3.add(iterator.next());
		}
		
		return set3;
	}
	
	private static void intersect(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
		
		Integer temp;
		Iterator<Integer> iterator = set1.iterator();
		
		while (iterator.hasNext()) {
			temp = iterator.next();
			if (set2.contains(temp)) {
				set3.add(temp);
			}
		}
		
	}
	
}


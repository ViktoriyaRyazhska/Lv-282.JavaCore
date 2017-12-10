package hw7_1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class main {
	
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		Set<Integer> setH1 = new HashSet<Integer>();	
		Set<Integer> setH2 = new HashSet<Integer>();	
		Set<Integer> unionSet = new HashSet<Integer>();
		Set<Integer> intersectSet = new HashSet<Integer>();
		
		fillRandSet(setH1, 10);
		fillRandSet(setH2, 10);
	
		System.out.println("Set1: " + setH1);
		System.out.println("Set2: " + setH2);
		
		unionSet = union(setH1, setH2);
		intersectSet = intersect(setH1, setH2);
		
		System.out.println();
		System.out.println("Union: " + unionSet);
		System.out.println("Intersection: " + intersectSet);
	}

	public static void fillRandSet (Set<Integer> numbers, int amount) {
		for (int i = 0; i < amount; i++) {
			numbers.add(rand.nextInt(20));
		}
	}
	
	public static Set<Integer> union (Set<Integer> setH1, Set<Integer> setH2){
		
		HashSet<Integer> set = new HashSet<Integer>();
		set = (HashSet<Integer>) ((HashSet<Integer>)setH1).clone();
		
		set.addAll(setH2);
		
		return set;
	}
	
	public static Set<Integer> intersect (Set<Integer> setH1, Set<Integer> setH2){
		
		HashSet<Integer> set = new HashSet<Integer>();
		set = (HashSet<Integer>) ((HashSet<Integer>)setH1).clone();
		
		set.retainAll(setH2);
		
		return set;
	}
}

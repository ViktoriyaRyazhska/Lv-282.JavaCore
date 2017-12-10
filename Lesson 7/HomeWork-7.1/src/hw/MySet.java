package hw;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//Тест, чи читає Git українську мову

public class MySet {

	private static Random random = new Random();
	
	public static Set generateSet(Set set, int size, int max, int min) {
		for (int i = 0; i < size; i++) {
			set.add(random.nextInt(max - min) + min);
		}
		return set;
	}

	public static Set union(Set set1, Set set2) {
		Set unitedSet = new HashSet<>();

		
		unitedSet.addAll(set1);
		unitedSet.addAll(set2);

//		for (Object object : set1) {
//			unitedSet.add(object);
//		}
//
//		for (Object object : set2) {
//			unitedSet.add(object);
//		}

		return unitedSet;
	}

	public static Set intersect(Set set1, Set set2) {
		Set intersectedSet = new HashSet<>();
		
		intersectedSet.addAll(set1);
		intersectedSet.retainAll(set2);

//		for (Object object1 : set1) {
//			for (Object object2 : set2) {
//				if (object1.equals(object2)) {
//					intersectedSet.add(object1);
//				}
//			}
//		}

		return intersectedSet;
	}

}

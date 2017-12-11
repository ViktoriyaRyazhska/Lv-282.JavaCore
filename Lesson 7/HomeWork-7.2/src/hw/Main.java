/*
 * Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
 * Output the entities of the map on the screen. 
 * There are at less two persons with the same firstName among these 10 people?
 * Remove from the map person whose firstName is ”Orest” (or other). 
 * Print result.  
 */

package hw;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Map<String, String> personMap = new TreeMap<String, String>();

		personMap.put("Petrov", "Vasya");
		personMap.put("Petrenko", "Orest");
		personMap.put("Bobul", "Ivo");
		personMap.put("Rotaru", "Sofia");
		personMap.put("Shevchenko", "Andriy");
		personMap.put("Gusev", "Oleg");
		personMap.put("Lirnik", "Anton");
		personMap.put("Pupkin", "Vasya");
		personMap.put("Zagoretskyi", "Orest");
		personMap.put("Bilokur", "Kateryna");

		printMap(personMap);
		System.out.println();
		
		checkSameNames(personMap);
		System.out.println();

		removePerson(personMap, "Orest");
		removePerson(personMap, "Sofia");

		printMap(personMap);

	}

	
	
	public static void printMap(Map<String, String> personMap) {
		for (Map.Entry<String, String> person : personMap.entrySet()) {
			System.out.println(person);
		}
	}

	public static void checkSameNames(Map<String, String> personMap) {
		int count;
		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			count = 0;
			Map.Entry<String, String> entryi = (Map.Entry<String, String>) i.next();

			for (Iterator<Entry<String, String>> j = personMap.entrySet().iterator(); j.hasNext();) {
				Map.Entry<String, String> entryj = (Map.Entry<String, String>) j.next();

				if (entryi.getValue().equals(entryj.getValue())) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("We have same names - " + entryi.getValue() + " " + entryi.getKey());
			}
		}
	}

	public static void removePerson(Map<String, String> personMap, String name) {
		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) i.next();
			if (entry.getValue().equals(name)) {
				i.remove();
			}
		}
	}

}

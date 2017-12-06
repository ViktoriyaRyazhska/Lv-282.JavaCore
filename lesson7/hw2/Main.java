package lesson7.hw2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> personMap = new TreeMap<String, String>();

		personMap.put("Ben", "Marian"); // lastname, firstname;
		personMap.put("Femiak", "Volodymyr");
		personMap.put("Zhemela", "Volodymyr");
		personMap.put("Burychka", "Ivan");
		personMap.put("Hrybovs'kyi", "Oleh");
		personMap.put("Rasiak", "Volodymyr");
		personMap.put("Rol's'kyi", "Vitalii");
		personMap.put("Kolisnichenko", "Oleh");
		personMap.put("Boiko", "Ihor");
		personMap.put("Popovych", "Ostap");
		personMap.put("Popovych", "Yuriy");
		printSet(personMap);
		
		System.out.println();
		isSameFirstName(personMap);
		
		removeByFirstName(personMap, "Volodymyr");
		printSet(personMap);
		
	}
	
	private static void printSet(Map<String, String> personMap) {
		
		Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}
	
	private static boolean isSameFirstName(Map<String, String> map) {
		
		Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
		Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
		Map.Entry<String, String> entry1;
		Map.Entry<String, String> entry2;
		
		while (iterator1.hasNext()) {
			entry1 = iterator1.next();
			{
				while(iterator2.hasNext()) {
					entry2 = iterator2.next();
					if (entry1.getValue().equals(entry2.getValue())){
						System.out.println("We have same first names in out map");
						return true;
					}
				}
			}
		}
		System.out.println("We don't have same first names in out map");
		return false;
	}

	
	private static void removeByFirstName(Map<String, String> map, String name) {
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		Map.Entry<String, String> entry;
		
		while(iterator.hasNext()) {
			entry = iterator.next();
			if(entry.getValue().equals(name)) {
				iterator.remove();
			}
		}
		
	}
	
	
	
}


//Create map personMap
//and add to it ten persons of type <String, String> (lastName, firstName).
//Output the entities of the map on the screen. 
//There are at less two persons with the same firstName among these 10 people?
//Remove from the map person whose firstName is ”Orest” (or other).
//Print result.  

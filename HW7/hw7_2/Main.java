package hw7_2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		
		String name= "Vacja";
	 
		
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("Ivan","Pupkiv");
		map.put("Hugo","Sonce");
		map.put("Esmeralda","Rutan");
		map.put("John","Lepo");
		map.put("Leonardo","Dikap");
		map.put("Leo","Suskin");
		map.put("Ona","Rutan");
		map.put("Vacja","Bobuk");
		map.put("Ona","lepo");
		map.put("Vacja","Sonce");
		
		System.out.println(map);
		System.out.println();
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> iter = set.iterator();
		for (Entry<String, String> entry : set) {
			System.out.println(entry);
			
	}
		System.out.println();
		//at less two persons with the same firstName among these 10 people
		System.out.println();
		Collection list = map.values();
		Collection list2 = map.values();
		 for (Object o : list) {
			 System.out.println();
			 if(list.equals(list2)) {
				
		 System.out.println("We have same first names in out map");
		 break;
			 }
			 else {
				 System.out.println("We don't have same first names in out map");
		break;
			 }
		 }
		 System.out.println();
		 
		 //Remove from the map person whose firstName is ”Orest” (or other). 
		 Iterator<Map.Entry<String, String>> iter2 = map.entrySet().iterator();
			Map.Entry<String, String> entry2;
			
			while(iter2.hasNext()) {
				entry2 = iter2.next();
				if(entry2.getKey().equals(name)) {
	           iter2.remove();
		         
		 }
				
		}
			Set<Entry<String, String>> set2 = map.entrySet();
			Iterator<Entry<String, String>> iter3 = set2.iterator();
			for (Entry<String, String> entry : set2) {
				System.out.println(entry);
	}}}

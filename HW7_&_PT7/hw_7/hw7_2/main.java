package hw7_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class main {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap();

		personMap.put("Volodymyr", "Femyak");
		personMap.put("Sansa", "Stark");
		personMap.put("Robert", "Stark");
		personMap.put("John", "Snow");
		personMap.put("Jaime ", "Lannister");
		personMap.put("Eddard ", "Stark");
		personMap.put("Cersei ", "Lannister");
		personMap.put("Daenerys", "Targaryen");
		personMap.put("Jorah ", "Mormont");
		personMap.put("Petyr", "Baelish");
			
		removeFirstName(personMap, "Femyak");
		System.out.println(personMap.toString());
		
//		System.out.println(isUniqueValue(personMap));
	}

//	   public static boolean isUniqueValue ( Map<String, String> map) {
//		   
//		   Iterator<Map.Entry<String, String>> iter1 = map.entrySet().iterator();
//		   Iterator<Map.Entry<String, String>> iter2 = map.entrySet().iterator();
//		   Iterator<Map.Entry<String, String>> tmpIter2 = map.entrySet().iterator();
//		   Map.Entry<String, String> entry1;
//		   Map.Entry<String, String> entry2;
//		   Map.Entry<String, String> entryTmp;
//		   
//		   iter2.next();	// move iter2 to second place
//		   
//		   entry1 = iter1.next();	  
//		   entry2 = iter2.next();
//		   entryTmp = tmpIter2.next();
//		   
//		   for (;iter1.hasNext();entry1 = iter1.next()){
//			   for (;iter2.hasNext();entry2 = iter2.next()) {
//				   if(entry1.getValue().equals(entry2.getValue()))
//					   return false;
//			   }
//			   iter2 = map.entrySet().iterator();
//		   }
//		   return true;
//	   }
	
	   public static void removeFirstName ( Map<String, String> map, String name) {
	   
	   Iterator<Map.Entry<String, String>> iter1 = map.entrySet().iterator();
	   Map.Entry<String, String> entry1;
	   
	   entry1 = iter1.next();	  
	   
	   for (;iter1.hasNext();){
		   if(entry1.getValue().equals(name)) {
			   map.remove(entry1.getKey());
			   return;
		   }
		   entry1 = iter1.next();
	   }
	  }
}

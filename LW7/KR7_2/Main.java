package KR7_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> map = new HashMap();
		map.put(1,"Ivan");
		map.put(2,"Hugo");
		map.put(3,"Esmeralda");
		map.put(4,"John");
		map.put(5,"Leonardo");
		map.put(6,"Leo");
		map.put(7,"Ona");
		System.out.println(map);
		System.out.println();
		
	
		
		//// Переконвертовую мапу в set щоб мати доступ до ітератора
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> iter = set.iterator();
		
		System.out.println("Input number emloyee ID: ");
		int number1 = Integer.parseInt(br.readLine());

			
			 if(map.containsKey(number1)) {
				 System.out.println(map.get(number1));
			 }
			 else {
				 System.out.println("enter error ID" );
				
			 }
			 
			 
			 System.out.println("Input name of emloyee: " );
				String name1 =br.readLine();	
				
				
				 while (iter.hasNext()) {
					 Entry<Integer, String> temp = iter.next();
					 if (temp.getValue().equals(name1)) {
						System.out.println("id"+temp.getKey()); 
						break;
					 }		 
				
				 
				 else {
					 System.out.println("enter error name" );
					break;
				 }
			
		}
	}}


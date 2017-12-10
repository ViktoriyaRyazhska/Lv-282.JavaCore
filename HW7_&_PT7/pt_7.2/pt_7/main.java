package pt_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Handler;

public class main {

		public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		Map<Integer, String> employeeMap = new HashMap();
		
		employeeMap.put(541,"John");
		employeeMap.put(729,"Vova");
		employeeMap.put(452,"Ragnar");
		employeeMap.put(960,"Olga");
		employeeMap.put(255,"Nataly");
		employeeMap.put(555,"Megane");
		employeeMap.put(876,"Ivar");
		
		Set set = employeeMap.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	         Map.Entry mEntry = (Map.Entry)iterator.next();
	         System.out.print("Key is: "+ mEntry.getKey() + " & Value is: ");
	         System.out.println(mEntry.getValue());
	    }
	    
	    System.out.println("\nEnter emloyee`s id:");
	    int id = Integer.parseInt(br.readLine());
	    
//	    System.out.println(employeeMap.containsKey(id));
	    
	    int flag = 0;
	    for ( Map.Entry<Integer, String> mEntry : employeeMap.entrySet()) {
			if(mEntry.getKey() == id) {
				System.out.println("Value of this key: " + mEntry.getValue());
				flag = 1;
			}
		}
	   	    
	    if(flag == 0)
	    	System.out.println("There isn`t any value to this key");
	    
	    System.out.println("\nEnter emloyee`s name:");
	    String name = br.readLine().toLowerCase();
	    
	    flag = 0;
	    for ( Map.Entry<Integer, String> mEntry : employeeMap.entrySet()) {
			if(mEntry.getValue().toLowerCase().equals(name)) {
				System.out.println("Key of this value: " + mEntry.getKey());
				flag = 1;
			}
		}
	    
	    if(flag == 0)
	    	System.out.println("There isn`t any key to this value");
		
	}

	
}

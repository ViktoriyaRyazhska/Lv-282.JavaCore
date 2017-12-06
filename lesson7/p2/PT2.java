package lesson7.p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PT2 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Map<Integer, String> employeeMap = new HashMap<>();
		
		employeeMap.put(11, "Andry");
		employeeMap.put(23, "Bob");
		employeeMap.put(33, "Candy");
		employeeMap.put(14, "Dilan");
		employeeMap.put(51, "Enver");
		employeeMap.put(82, "Freddy");
		employeeMap.put(12, "Georg");
		
		showEmployee(employeeMap);
		
		System.out.println("Input number emloyee ID: ");
		showByID(employeeMap, Integer.parseInt(br.readLine()));
		
		System.out.println();
		
		System.out.println("Input name of emloyee: ");
		showByName(employeeMap, br.readLine());
		
		
	}

	private static void showEmployee(Map<Integer, String> map) {
		Iterator<Entry<Integer, String>> i = map.entrySet().iterator();
		while (i.hasNext()) {
			Entry<Integer, String> entry = i.next();
			System.out.println("ID: " + entry.getKey() + " : name: " + entry.getValue() );
		}
	}
	
	public static void showByID(Map<Integer, String> map, Integer keyNumber) {
		
		if (map.containsKey(keyNumber)) {
			System.out.println("By keyNumber " + keyNumber + " is " + map.get(keyNumber));
		} else {
			System.out.println("Sorry, but ID " + keyNumber + " don't exist");
		}
		
	}
	
	public static void showByName(Map<Integer, String> map, String name) {
		
		if (!map.containsValue(name)) {
			System.out.println("Sorry but employee with name " + name + " don't exist");
		} else {
			Integer key = -1;
			for(Map.Entry<Integer, String> entry : map.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.println("jiuhuig");
					key = entry.getKey();
				}
			}
			System.out.println("Employee " + name + " have ID:  " + key);
		}
		
	}
	
}



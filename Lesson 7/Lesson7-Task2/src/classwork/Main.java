/*
 * In the main() method declare map employeeMap of pairs <Integer, String>.
 * Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
 * Ask user to enter ID, then find and write corresponding name from your map. 
 * If you can't find this ID - say about it to user (use function containsKey()).
 * Ask user to enter name, verify than you have name in your map and write corresponding ID.
 * If you can't find this name - say about it to user (use function containsValue()). 
 */

package classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		employeeMap.put(1, "Olena");
		employeeMap.put(2, "Andriy");
		employeeMap.put(3, "Ira");
		employeeMap.put(4, "Dima");
		employeeMap.put(5, "Oleg");
		employeeMap.put(6, "Andriy");
		employeeMap.put(7, "Taras");

		System.out.println(employeeMap);

		System.out.println("Enter ID");
		int id = Integer.parseInt(br.readLine());

		if (employeeMap.containsKey(id)) {
			System.out.println(employeeMap.get(id));
		} else {
			System.out.println("There is no Employee with ID as you want");
		}
		System.out.println();
		
		

		System.out.println("Enter name");
		String name = br.readLine();

		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if (entry.getValue().equals(name)) {

				System.out.println(name + " has ID " + entry.getKey());
			}
		}

		if (!employeeMap.containsValue(name)) {
			System.out.println("There is no Employee with this name");
		}

	}

}

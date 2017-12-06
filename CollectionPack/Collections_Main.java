/*Declare collection myCollection of 10 integers and fill it (from the console or random).
Find and save in list newCollection all positions of element more than 5 in the collection. 
Print newCollection
Remove from collection myCollection elements, which are greater then 20. Print result
Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – 
xxx, value of element – xxx”
Sort and print collection */
/*In the main() method declare map employeeMap of pairs <Integer, String>.
Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
Ask user to enter ID, then find and write corresponding name from your map. 
If you can't find this ID - say about it to user (use function containsKey()).
Ask user to enter name, verify than you have name in your map and write corresponding ID. 
If you can't find this name - say about it to user (use function containsValue()). 
*/

package CollectionPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Collections_Main {
	
	public static void main(String[] args) {
		 try {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements you want to add to the array: ");
		int n = Integer.parseInt(in.readLine());
		System.out.println("enter numbers : ");
		 ArrayList myCollection = new ArrayList();
		 //Iterator it = newCollection.iterator();
		 ArrayList newCollection = new ArrayList();
		
		for (int i = 0; i < n; i++) {
			myCollection.add(in.readLine());
		}
		for (int i = 5; i < n; i++) {
			newCollection.add(myCollection.get(i));
		}
		System.out.println(newCollection.toString());
		System.out.println(myCollection.toString());
		
		for (int i = 0; i<newCollection.size(); i++) {
			int g = Integer.parseInt((String) newCollection.get(i));
			if (g > 20) {
				newCollection.remove(i);
			}
			myCollection.set(2, 1);
			myCollection.set(8, -3);
			myCollection.set(5, -4);
			
		}
		
		System.out.println(myCollection.toString());
		
		for (int i=0; i<myCollection.size(); i++) {
			Object s = myCollection.get(i);
			System.out.println("position - " + i + ", " + "value of element - " + s);
		}
		
		
		
		   System.out.println(myCollection.toString());
		   System.out.println(newCollection.toString());	
			} catch (IOException e) {
				e.printStackTrace();
			}
		 
		}

		
	}


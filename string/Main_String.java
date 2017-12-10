
/*Enter the two variables of type String. Determine whether the first variable substring second.
 
 * For example, if you typed «IT» and «IT Academy» you must receive true.
Enter surname, name and patronymic on the console as a variable of type String. 
Output on the console:
surnames and initials
name
name, middle name and last name
The user name can be 3 to 15 characters 
of the Latin alphabet, numbers, and underscores. Using regular expressions implement checking the user name for validity. Input five names in the main method . Output a message to the console of the validation of each of the entered names.
*/



package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_String {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			//Substring.Deteerminate(in.readLine(), in.readLine()); 
			//Substring.initials(in.readLine());
		for (int i=0; i<4; i++) {
			if (Substring.validation(in.readLine())) {
				System.out.println("Username corect");}
				else System.out.println("Username incorect");}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

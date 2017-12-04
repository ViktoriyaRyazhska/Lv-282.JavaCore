import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4 {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		int element, dob = 1;
		
		System.out.println("Enter numbers (negative number to stop):");
		
		
		do {
			element = Integer.parseInt(br.readLine());
			if(element%2 == 0 && element > 0)
				dob *= element;
		} while (element>0);

		System.out.println("The product of EVEN numbers is " + dob);
		
	}
	
}

package java_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int mountEven = 0;
		int value;
		
		do {
			 System.out.println("Enter number: ");
			 value = Integer.parseInt(br.readLine());
			 mountEven = (value % 2 == 0) ? (mountEven + 1) : (mountEven);
		} while (value > 0);
		
		System.out.println("You entered " + mountEven + " even numbers");

	}

}


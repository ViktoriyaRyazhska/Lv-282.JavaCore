package classWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {


		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int count = 0;
		int number = 2;
		int currentNumber = 0;

		while (currentNumber <= number) {
		
			System.out.println("Input Number: ");
		
			if (Integer.parseInt(br.readLine()) % 2 > 0) {
				count++;
			}
		currentNumber++;
	
		}
			
		System.out.println(count);
	
	}

}

package java_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		int monthNumber;
		
		do {
			System.out.println("Please, enter number of month");
			monthNumber = Integer.parseInt(br.readLine());
			if ((monthNumber < 1) || (monthNumber > 12)) {
				System.out.println("You input wrong number");
			}
		} while ((monthNumber < 1) || (monthNumber > 12));
		
		System.out.println("The " + (monthNumber) + " month has " + months[monthNumber-1] + " days");

	}

}



package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Input month (1-12):");
		
		int month = Integer.parseInt(br.readLine());
		
		if ((month>0) && (month <=12)) {			
			System.out.println("In this month we have " + days[month-1] + " days");
		}else {
			System.out.println("Ooops... Mistake...");
		}	
	}
}

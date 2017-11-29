package java_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AT1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		int century;
		
		do {
			System.out.println("Please, enter a year (Year must be between 1 and 2100)");
			year = Integer.parseInt(br.readLine());
		} while ( (year < 1) || (year > 2100));
		
		century = (year + 99) / 100;
		System.out.println("It is " + century + " century");

	}

}

package hw;

import java.io.BufferedReader;
import java.io.IOException;

public class IntNumber {
	
	private int intNumber = 0;
	
	private static int max = Integer.MIN_VALUE;
	private static int min = Integer.MAX_VALUE;
	
	public IntNumber (BufferedReader br) throws NumberFormatException, IOException {
		
		System.out.println();
		System.out.println("Input your int number:");
		this.intNumber = Integer.parseInt(br.readLine());
		
		if (this.intNumber > max) {
			max = this.intNumber;
		}
		
		if (this.intNumber < min) {
			min = this.intNumber;
		}
	}
	
	public static void checkMaxMin() {
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}

}

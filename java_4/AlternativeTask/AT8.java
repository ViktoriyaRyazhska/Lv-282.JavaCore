package jcore4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AT8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input first number: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Input second number: ");
		int b = Integer.parseInt(br.readLine());
		int nsd = 1;
		
		do {
			if (a > b) {
				a = a - b;
			} else if (b > a) {
				b = b - a;
			}
			
			if (a == b) {
				nsd = a;
			}
			
		} while (a != b); 
		
		System.out.println("NSD is equal: " + nsd);
			

	}

}

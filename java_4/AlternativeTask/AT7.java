package java_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AT7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String number;
		int k;
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input k");
		k = Integer.parseInt(br.readLine());
		
		number = String.valueOf(10);
		for (int i = 11; i < 100; i++) {
			number += String.valueOf(i);
		}
		
		System.out.println(number);
		System.out.println(number.charAt(k+1));
		
	}

}

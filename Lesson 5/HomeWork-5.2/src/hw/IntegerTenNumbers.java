package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerTenNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {


		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		System.out.println("Input 10 integer numbers");
		
		for (int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int sum = 0;
		for (int i=0; i<5; i++) {
			if(arr[i]>0) {
				sum += arr[i];
			} else {
				sum = 0;
				break;
			}
		}
		
		int product = 1;
		for (int i=5; i<10; i++) {
			product *= arr[i];
		}
		
		if (sum != 0) {
			System.out.println("SUM 1:5 = " + sum);
		} else {
			System.out.println("PRODUCT 6:10 = " + product);
		}
		
	}
}

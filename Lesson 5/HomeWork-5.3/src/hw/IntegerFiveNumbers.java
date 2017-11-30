package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerFiveNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		System.out.println("Input 5 integer numbers");
		
		for (int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				++count;
			}
			if(count == 2) {
				System.out.println(arr[i]);		
				break;
			}
		}
		
		int min = arr[0];
		int minPosition = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]< min) {
				min = arr[i];
				minPosition = i;
			}
		}
		
		System.out.println("Mimimum = " + min + " on position " + minPosition);
	
	}

}

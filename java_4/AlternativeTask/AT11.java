package jcore4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AT11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number n");
		int n = Integer.parseInt(br.readLine());
		
		int[] t = new int[n];
		int[] c = new int[n];
		
		int minIndex = 0;
		
		System.out.print("Time  for  each customer:  ");
		for (int i = 0; i < n; i++) {
			t[i] = new Random().nextInt(20)+1;
			if (t[minIndex] > t[i]) {
				minIndex = i;
			}
			System.out.print(t[i] + "\t");
		} 
		
		System.out.print("\nWaiting time for customer: ");

		for (int i = 0; i < n; i++) {
			c[i] = 0;
			for (int j = 0; j < i+1; j++) {
				c[i] = c[i] + t[j];
			}
			System.out.print(c[i] + "\t");
		}
		
		System.out.println();
		System.out.println("Minimum time for customer # " + (minIndex+1));
		
		
	}

}

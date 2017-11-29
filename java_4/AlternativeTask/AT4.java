package java_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AT4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input n");
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		int[] newA = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = (new Random().nextInt(18)) - 9;
		}
		
		for (int i = 0; i < n; i++) {
			newA[i] = a[i];
			for (int j = 0; j < i; j++) {
				newA[i] += a[j];  	
			}
			newA[i] = Math.abs(newA[i]);
		}
		
		for (int value: a) {
			System.out.print(value + "\t");
		}
		
		System.out.println();
		for (int value: newA) {
			System.out.print(value + "\t");
		}
		
		
	}

}

package jcore4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AT10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Input number n >= 2");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		double[] a = new double[n];
		
		double r = 7.5; //new Random().nextDouble()*10;
		
		for(int i = 0; i < n; i++) {
			a[i] = new Random().nextDouble()*20 - 10;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i]*a[i] + a[j]*a[j] < r*r) {
					count++;
				}
			}
		}
		
		System.out.println("Number of point in circle equal: " + count);
		
	}

}

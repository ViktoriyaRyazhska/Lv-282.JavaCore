package jcore4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class AT12 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number of referies");
		
		int n = Integer.parseInt(br.readLine());
		
		double[] score = new double[n];
		
		System.out.print("All score of referies: ");
		for (int i = 0; i < n; i++) {
			score[i] = new Random().nextDouble()*7 + 3;
			System.out.printf("%.3f   ", score[i]);
		}
		
		Arrays.sort(score);
		System.out.printf("\n minimum: %.3f", score[0]);
		System.out.printf("\n maximum: %.3f", score[score.length - 1]);
		System.out.printf("\n everage: %.3f",  
				 ( Arrays.stream(score).sum()-(score[0]+score[score.length - 1])) / (score.length - 2)  );
	}

}

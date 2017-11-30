package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveArray {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		long product = 1;
		int[] arr = new int[50];

		while (true) {
			System.out.println("Input integer number");
			int element = Integer.parseInt(br.readLine());

			if (element >= 0) {
				arr[i] = element;
				if ((element % 2 == 0) && (element != 0)) {
					product *= element;
				}
				i++;

			} else {
				break;
			}

		}

		System.out.println("Product od all even numbers = " + product);
	}

}

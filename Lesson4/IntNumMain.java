package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntNumMain {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter three integer numbers: ");
		while (IntNum.i < 3) {
			new IntNum(Integer.parseInt(br.readLine()));
			IntNum.i++;
		}

		IntNum.MinMax();

	}
}
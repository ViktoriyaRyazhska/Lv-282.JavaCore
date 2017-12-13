package lesson9.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {

		try {
			System.out.println("Result of division: " + div());
		} catch (NumberFormatException e) {
			System.err.println("You input wrong value");
		} catch (DivideToZeroException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println("Somethink wrong");
		}

	}

	private static int div() throws DivideToZeroException, NumberFormatException, IOException {

		int a = getInt();
		int b = getInt();

		if (b == 0) {
			throw new DivideToZeroException();
		} else {
			return a / b;
		}

	}

	private static int getInt() throws NumberFormatException, IOException {

		System.out.println("Enter you integer number: ");
		return Integer.parseInt(br.readLine());
		
	}

}


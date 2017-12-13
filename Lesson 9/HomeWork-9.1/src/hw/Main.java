/*
 * Create method div(), which calculates the dividing of two double numbers. 
 * In main method input 2 double numbers and call this method. 
 * Catch all exceptions. 
 */

package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double a = read(br, "a");
		double b = read(br, "b");
		try {
			System.out.println(div(a, b));
		} catch (Exception e) {
			System.err.println(e.getClass().getSimpleName());
		}
	}

	public static double read(BufferedReader br, String string) {
		double d = 0;
		System.out.println("Input " + string);
		try {
			d = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.err.println(e.getClass().getSimpleName());
		} catch (IOException e) {
			System.err.println(e.getClass().getSimpleName());
		}
		return d;
	}

	public static double div(double a, double b) {
		double result = 0;
		try {
			if (b == 0) {
				throw new ArithmeticException();
			}
			result = a / b;
		} catch (ArithmeticException e) {
			System.err.println(e.getClass().getSimpleName());
		}
		return result;
	}
}

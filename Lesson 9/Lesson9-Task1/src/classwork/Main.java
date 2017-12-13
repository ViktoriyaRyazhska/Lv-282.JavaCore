/* Create a method for calculating the area of a rectangle int squareRectangle 
 * (int a, int b), which should throw an exception if the user enters negative value. 
 * Input values a and b from console. 
 * Check the squareRectangle method in the method main. 
 * Check to input nonnumeric value.
 */

package classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = checkIfNegative(br, "A");
		int b = checkIfNegative(br, "B");
		System.out.println(a + " * " + b + " = " + squareRectangle(a, b));

	}

	// Reading from console. Check if format is acceptable. 
	// If negative - throw Exception
	public static int read(BufferedReader br) throws IOException, MyNegativeNumberException {
		int k = 0;
		try {
			k = Integer.parseInt(br.readLine());
			if (k < 0) {
				throw new MyNegativeNumberException("Negative value is unacceptable");
			}
		} catch (NumberFormatException e) {
			System.out.println(e.getClass().getSimpleName() + "! Input numeric values!");
		}
		return k;
	}

	// Handling of Exception. Loop while we will get acceptable number
	public static int checkIfNegative(BufferedReader br, String string) throws IOException {
		int k = 0;
		while (k == 0) {
			System.out.println("Input " + string);
			try {
				k = read(br);
			} catch (MyNegativeNumberException e) {
				System.err.println(e.getMessage());
			}
		}
		return k;
	}

	public static int squareRectangle(int a, int b) {
		return a * b;
	}

}
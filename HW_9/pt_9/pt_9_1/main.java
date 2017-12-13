package pt_9_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	while(true) {
		try {
			System.out.print("Enter side 'a': ");
			int a = Integer.parseInt(br.readLine());
			System.out.print("Enter side 'b': ");
			int b = Integer.parseInt(br.readLine());
			
			System.out.println("The area of rectangle is " + squareRectangle(a, b));
			
		} catch (NumberFormatException e) {
			System.err.println("You entered incorect data! You need to enter only integers\n");
			continue;
		} catch (ArithmeticException e) {
			System.err.println("Error! You entered negative numbers\n");
			continue;
		}
		System.out.println("Do you want to run this aplication again? ('n' - no, smth else - yes)");
		char var = (char) br.read();
		
		if(var == 'n')
			break;
	}
	
	}
	
	public static int squareRectangle (int a, int b) throws ArithmeticException {
		if(a<0 || b<0)
			throw new ArithmeticException();
		return a*b;
	}

}

package lesson9.pr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		int a, b;

		try {
			a = getInt();
			b = getInt();
			System.out.println("Square of rectangle equal: " + squareRectangle(a, b));
			
		} catch (NumberFormatException e) {
			System.err.println("You write not integer number");
		} catch (IOException e) {
			System.err.println("IOException");
		} catch (LessZerroValue e) {
			System.err.println("You write value less than zero");
		}
		
	}

	private static int squareRectangle(int a, int b) {
					
		return a*b;
	}

	private static int getInt() throws NumberFormatException, IOException, LessZerroValue {
		int value;
		System.out.println("Input ineger");
		value = Integer.parseInt(br.readLine());
		if ( value > 0 ) {
			return value;
		} else {
			throw new LessZerroValue();
		}  
	}
	
	private static class LessZerroValue extends Exception {
		private static final long serialVersionUID = -6130156843370108259L;
	
		private LessZerroValue() {
		
		}
		
		private LessZerroValue(String arg0) {
			super(arg0);
		}
	}
}

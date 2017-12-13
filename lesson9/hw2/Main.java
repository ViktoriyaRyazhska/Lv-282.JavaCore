package lesson9.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		
		int start = 0;
		int end = 9;
		
		for (int i = 0; i < 10; i++) {
			
			try {
				System.out.println("Number is: " + readNumber(start, end));
			} catch (NumberFormatException e) {
				System.err.println("You intup wrong value");
			} catch (NoMeasureExcepion e) {
				System.err.println(e.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	private static int readNumber(int start, int end) throws NoMeasureExcepion, NumberFormatException, IOException {
		int number;
		System.out.println("Input number in measure: " + start + " and " + end);
		number = Integer.parseInt(br.readLine());
		
		if (number > end || number < start) {
			throw new NoMeasureExcepion();
		} else {
			return number;
		}
		 
	}

	private static class NoMeasureExcepion extends Exception{

		private static final long serialVersionUID = 7210575106269075116L;

		public NoMeasureExcepion() {

		}

		@Override
		public String toString() {
			return "You number out of limit";
		}
		
	}

}




//Write a method readNumber(int start, int end), 
//that read from console integer number and return it, if it is in the range [start...end]. 
//If an invalid number or non-number text is read, the method should throw an exception. 
//Using this method write a method main(),
//that has to enter 10 numbers:
//a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

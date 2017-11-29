package java_4;
import java.util.Random;

public class HW2 {

	public static void main(String[] args) {
		
		int[] numbers = getNumbers(10);
		printNumbers(numbers);
		calculate(numbers);

	}

	private static int[] getNumbers(int amount) {
		
		int[] numbers = new int[amount];
		
		for (int i = 0; i < amount; i++) {
			numbers[i] = new Random().nextInt(18) - 9;			 
		}
		
		return numbers;
	}
	
	private static void printNumbers(int[] numbers) {
		for (int number: numbers) {
			System.out.print(number + ";  ");
		}
		System.out.println();
	}
	
	private static int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum +=numbers[i];
		}
		
		return sum;
	}
	
	private static int product(int[] numbers){
		int product = 1;
			for ( int i = 5; i < 10; i++) {
				product *=numbers[i];
			}
		return product;
	}
	
	private static void calculate(int[] numbers) {
		int sum = sum(numbers);
		int product = product(numbers);
		
		if (sum > 0) {
			System.out.println("The sum of elements from 1 to 5 is: " + sum);
		} else {
			System.out.println("The product of elements from 6 to 10 is: " + product);
		}
		
		
		
	}
}



//Enter 10 integer numbers.
//Calculate the sum of first 5 elements
//if they are positive or
//product of last 5 element in the other case.

package java_4;

import java.util.Random;

public class HW3 {

	public static void main(String[] args) {
		
		
		int[] numbers = getIntegers(5);
		printArray(numbers);
		positionOfPositive(numbers);
		indexOfMinimum(numbers);
		
	}
	
	private static int[] getIntegers(int amout) {
		
		int[] array = new int[amout];
		Random random = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(19) - 9;
		} 
		
		
		return array;
	}

	private static void printArray(int[] array) {
		for(int value: array) {
			System.out.print(value + ";  ");
		}
		System.out.println();
	}
	
	private static void positionOfPositive(int[] array) {
		
		int position = -1;
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			count = ( array[i] > 0) ? (count + 1) : (count); 
			if ( count > 1) {
				position = i;
				break;
			}
		}
		
		switch (count) {
		case 2:
			System.out.println("The second positive number is " + array[position] + " at position " + (position + 1));
			break;
		case 1:
			System.out.println("In array only 1 positiv number");
			break;
		default:
			System.out.println("No positiv numbers in array");
			break;
		}
		
	}
	
	private static int indexOfMinimum(int[] array) {
		
		int minIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			minIndex = (array[minIndex] > array[i]) ? (i) : (minIndex);
		}
		System.out.println("The minimum value is " + array[minIndex] + " at " + (minIndex + 1) + " position");
		return minIndex;
	}
}













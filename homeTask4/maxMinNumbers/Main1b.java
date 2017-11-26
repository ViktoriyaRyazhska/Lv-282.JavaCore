package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1b {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
							   
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] numbers;
		
		numbers = getNumbers(); 
		System.out.println("The max value is " + numbers[maxValue(numbers)]);
		System.out.println("The min value is " + numbers[minValue(numbers)]);
		
	}

	public static int[] getNumbers() throws NumberFormatException, IOException {
		int[] array = new int[3];
		System.out.println("intup 3 integer numbers");
		for (int i = 0; i < 3; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}		
		return array;
	}
	
	public static int maxValue(int[] array) {
		
		int index = 0;
		for(int i = 1; i < array.length; i++) {
			index = (array[index] < array[i]) ? i : index;
		}
		return index;
	}
	
	public static int minValue(int[] array) {
			
			int index = 0;
			for(int i = 1; i < array.length; i++) {
				index = (array[index] < array[i]) ? index : i;
			}
			return index;
		}
}

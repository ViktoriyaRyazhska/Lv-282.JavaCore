package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1a {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		float[] numbers;
		int quantity;
		
		System.out.println("Write have many numbers you want to type");
		quantity = Integer.parseInt(br.readLine());
		
		numbers = getNumbers(quantity);
		
		if (belongToRange(numbers, -5f, 5f)) {
			System.out.println("The numbers you added belong to the range [-5, 5]");
		} else {
			System.out.println("The number you added don't belong to the range [-5, 5]");
		}
			
	}
	
	public static float[] getNumbers(int quantity) throws NumberFormatException, IOException {
		
		float[] array = new float[quantity];
		
		for (int i = 0; i < quantity; i++) {
			array[i] = Float.parseFloat(br.readLine());
		}
		
		return array;
	}
	
	public static boolean belongToRange(float[] array, float minLimit, float maxLimit) {
		
		for(float value: array) {
			if ((value > maxLimit) || (value < minLimit)) {
				return false;
			}
		}
		
		return true;
	}
	
}

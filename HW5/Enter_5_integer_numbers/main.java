package Enter_5_integer_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Input   10 numbers");
		int[] numbers=new int [5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=Integer.parseInt(br.readLine());

	}
		for (int i = 0; i < numbers.length; i++) {
			if(i==1) {
				System.out.println("position of second positive number "+numbers[i]);
			}
			
		}
		int min= 0;
		min = numbers[0];
		int position=0;
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			    position=i;}
		}
System.out.println("minimum "+min+ " and its position in the array "+position);
}
}

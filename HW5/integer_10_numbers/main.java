package integer_10_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Input   10 numbers");
		
		int[] numbers=new int [10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=Integer.parseInt(br.readLine());
//			if(numbers[i]!=0) {
//				System.out.println(numbers[i]);				
//			}			
		}
		// Calculate the sum of first 5 elements
		int sum=0;
		for (int i = 0; i < 5; i++) {
			if( numbers[i]>0) {
				sum+=numbers[i];
			}			
			else{
				sum=0;
				//System.out.println("numbers have negative");
				break;
			}			
			
		}
		//System.out.println(sum);
		//product of last 5 element 
		int product=1;
		for (int i = 5; i < 10; i++) {
			product*=numbers[i];

	}
		//System.out.println("product [5 -10] have"+product);
		
		if(sum!=0) {
			System.out.println("sum [1-5] have "+sum);
			
		}else{
			System.out.println("product [5 -10] have "+product);
		}

}
}

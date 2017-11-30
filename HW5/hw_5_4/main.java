package hw_5_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException, ArrayIndexOutOfBoundsException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Input   10 numbers");
		
		int i=0;
		int Count=1;
		
		int[] numbers= new int[100]  ;
		
		for (int j = 0; j < numbers.length; j++) {
			int number=Integer.parseInt(br.readLine());
			
			if(number>0) {
				numbers[i]=number;
				i++;
				Count*=number;
			}
			else {
				break;
			}
		}
		
		System.out.println(Count);
		
	}
		}
		
		

	



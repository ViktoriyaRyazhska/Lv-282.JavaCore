package integer_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			
			System.out.println("Enter int-1");
			int number1 = Integer.parseInt(br.readLine());
			System.out.println("Enter int-2");
			int number2 = Integer.parseInt(br.readLine());
			System.out.println("Enter int-3");
			int numbe3 = Integer.parseInt(br.readLine());
			
			Object[] mas= {number1,number2,numbe3};
			
			
				int max = 0;
				for (int i = 0; i < mas.length; i++) {
					if (max < (int)mas[i])
						max =  (int)mas[i];
					
				}
				
				System.out.println("max = "+max);
				
			
			
				int min= max;
				for (int i = 0; i < mas.length; i++) {
					if (min > (int)mas[i])
						min = (int) mas[i];
					
				}
				
				System.out.println("min = "+min);
				

	}
			
			
				
			}

		
		
		
			
		
	
		
	

	



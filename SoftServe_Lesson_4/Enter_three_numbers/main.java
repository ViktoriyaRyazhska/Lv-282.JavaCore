package Enter_three_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		
		System.out.println("enter the Number 1");
        int Number_1=Integer.parseInt(br.readLine());
        
        System.out.println("enter the Number 2");
        int Number_2=Integer.parseInt(br.readLine());
        
        System.out.println("enter the Number 3");
        int Number_3=Integer.parseInt(br.readLine());
        
        
        
        int numbers_0[]= {Number_1,Number_2,Number_3};
        int number=0;
        for (int i : numbers_0) {
        	
        if ((i % 2)==0) {
        	number++;
        	}
       	
		}
         System.out.println(number);
	}

}

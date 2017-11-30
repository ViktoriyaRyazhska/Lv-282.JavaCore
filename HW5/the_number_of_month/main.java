package the_number_of_month;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int count;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("enter the number of month! ");
		int number = Integer.parseInt(br.readLine());
		
		int[]sum_amount_days= { 31,28,31,30,31,30,31,31,30,31,30,31};
		
		
			for (int i = 0; i < sum_amount_days.length; i++) {
				if((number-1)==i) {
					 count=sum_amount_days[i];
					System.out.println("mount ¹ "+number+", have "+count+" days");
				}
				
				
				
			}
		
	}}
		
		
			
		
		
			
		
	
		
		
		
	





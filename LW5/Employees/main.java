package Employees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException,NullPointerException {
		
		 Employee [] empl= new  Employee [5];
		 
	     empl[0]=new Employee ("vova",4,15000);
	     
	     empl[1]=new Employee ("vika",1,10000);
	     empl[2]=new Employee ("vasja",3,5000);
	     empl[3]=new Employee ("bob",4,5000);
	     empl[4]=new Employee ("Gek",1,20000); 
	     
	     BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	     System.out.println("Enter 1 or 3 or 4");
			int number1 = Integer.parseInt(br.readLine());
			
			
			
           //(enter department number in the console
			for (int i = 0; i < empl.length; i++) {
				  if(empl[i].getDepartment_number()==number1) {
					  System.out.println(empl[i].toString());
				  }
			}
			System.out.println();
			
			// by the field salary in descending order
			Employee.arrange_workers_by_the_field_salary(empl);
			
	}
}


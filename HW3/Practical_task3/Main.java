package Practical_task3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Employee emp_0= new Employee();
		Employee emp_1= new Employee("vova",100,3);
		Employee emp_2= new Employee("Gek",50,2.5);
		Employee emp_3= new Employee("Bob",70,3.4);
		
			
		
		Object [] mas= {emp_1, emp_2, emp_3};
		for (Object object : mas) {
			System.out.println(object);
			
		}
		//to change the rate of employee
          emp_0.changeRate();
          System.out.println(emp_0.output_changeRate());
	}


}

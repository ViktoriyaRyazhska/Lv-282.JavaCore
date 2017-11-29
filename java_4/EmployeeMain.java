package java_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Employee[] employees = new Employee[5]; 
		
		employees[0] = new Employee("Andryy", 2, 1700);
		employees[1] = new Employee("Brian",  1, 2300);
		employees[2] = new Employee("Conrad", 3, 700);
		employees[3] = new Employee("Dave",   2, 1400);
		employees[4] = new Employee("Entony", 1, 1700);
		Employee.printEmployee(employees);
		
		System.out.println("Enter number of department: ");
		Employee.showDeparmentEmployee(employees, Integer.parseInt(br.readLine()));
		
		Employee.arrangeBySalary(employees);
		
	}
	
}


//Create a class Employee with fields name, department number, salary.
//Create five objects of class Employee. 
//Display all employees of a certain department (enter department number in the console);
//arrange workers by the field salary in descending order.
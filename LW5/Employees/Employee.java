package Employees;

import java.io.BufferedReader;
import java.io.IOException;

public class Employee {
	private String name;
	private int department_number;
	private int salary;
	
//	
//	public Employee() {
//		
//	}


	public Employee(String name, int department_number, int salary) {
		this.name = name;
		this.department_number = department_number;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDepartment_number() {
		return department_number;
	}


	public void setDepartment_number(int department_number) {
		this.department_number = department_number;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", department_number=" + department_number + ", salary=" + salary + "]";
	}
	
	
	public  static void arrange_workers_by_the_field_salary( Employee [] empl ) {
	
				for (int i = 0; i < empl.length; i++) {
					for (int j = i + 1; j < empl.length; j++) {
						    if (empl[i].getSalary() < empl[j].getSalary()) {
							Employee temp = empl[j];
							empl[j] = empl[i];
							empl[i] = temp;
						}
						  
			}
					 System.out.println(empl[i].toString());
		}
		
	}}
		
	
		
		
	
	
	
	
	
	
	



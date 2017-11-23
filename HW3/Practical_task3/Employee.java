package Practical_task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	
	private String name;
	private int rate;
	private double hours; 
	
	private static double totalSum=0;

	public Employee() {
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}


	
	
	// the salary of person
	public double salary() {
		return rate*hours;
	}
	//to change the rate of employee
	public void  changeRate() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("  change the rate");
		setRate(Integer.parseInt(br.readLine()));
	}
	public Object output_changeRate()  {		
		return toString();
	}
	
	//calculate 10% from salary
	public int bonuses() {
		return (int)salary()/100*10;
		
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours +
				", salary "+salary()+", bonuses "+bonuses()+"]";
	}
	
	
	
	
	
	
	

}

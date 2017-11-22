package prTask3;

public class Employee {
	
	private String name;
	private int rate;
	private int hours; 
	
	private static double totalSum = 0;

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public int getRate() {
		return rate;
	}

	public int getHours() {
		return hours;
	}
	
	public int salary() {
//		int salary = this.rate * this.hours;
		totalSum += this.rate * this.hours;
		return (this.rate * this.hours);
//		return salary;
	}

	
	@Override
	public String toString() {
		return ("The employee " + this.name + " has rate " + this.rate + " worked " + hours + " hours"
				+ " and have salary " + this.salary());
	}

	public void changeRate(int rate) {
		System.out.println("To " + this.name + " we change rate from " + this.rate + " to " + rate + " and now his salary is " + (rate * this.hours) );
		totalSum += (rate - this.rate) * this.hours;
		this.rate = rate;
	}
	
	public double bonuses() {
		System.out.println("We give bonus for " + this.name + " and now his salary is " + (this.rate * this.hours * 1.1) );
		totalSum -= this.rate * this.hours*0.9;
		return salary()*1.1;
	}

	public static double showTotalSalary() {
		return totalSum;
	}
}

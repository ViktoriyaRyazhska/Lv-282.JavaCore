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
		int salary = this.rate * this.hours;
		totalSum += this.rate * this.hours;
		return salary;
	}

	
	@Override
	public String toString() {
		return ("The employee " + this.name + " has rate " + this.rate + " worked " + hours + " hours"
				+ " and have salary " + this.salary());
	}

	public void changeRate(int rate) {
		int oldRate = this.rate;
		this.rate = rate;
		totalSum = totalSum - oldRate*this.hours + this.rate * this.hours;
		System.out.println("To " + this.name + " we change rate from " + oldRate + " to " + this.rate);
	}
	
	public double bonuses() {
		double salary;
		salary = this.rate * this.hours * 1.1;
		totalSum += this.rate * this.hours * 0.1;
		return salary;
	}

	public static double showTotalSalary() {
		return totalSum;
	}
}

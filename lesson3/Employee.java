package lesson3;

public class Employee {

	// three private fields: name, rate and hours
	private String name;
	private double rate;
	private int hours;

	// static field totalSum
	public static double totalSum;

	// default constructor
	public Employee() {
		totalSum += Salary();
	}

	// constructor with 2 parameters (name and rate)
	public Employee(String name, double rate) {

		this.name = name;
		this.rate = rate;
		totalSum += Salary();
	}

	// constructor with 3 parameters
	public Employee(String name, double rate, int hours) {

		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += Salary();
	}

	// properties for access to these fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	// method to change the rate of employe
	public void ChangeRate(double rate) {
		this.rate = rate;
	}

	// method to calculate the salary of person (rate * hours)
	public double Salary() {
		return rate * hours;
	}

	// method to calculate 10% from salary
	public double Bonuses() {
		return 0.1 * rate * hours;
	}

	// method to output information about employee
	@Override
	public String toString() {
		return name + "\t\t" + rate + "\t" + hours + "\t" + ((double) ((int) Math.round(Salary() * 100)))/100 + "\t"
				+ ((double) ((int) Math.round(Bonuses() * 100)))/100 + "\t"	+ (Salary() + Bonuses())+ "\n";
	}
}

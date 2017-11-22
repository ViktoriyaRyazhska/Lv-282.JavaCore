

public class Employee {
	
	private String name;
	private double rate;
	private int hours;
	
	private static double totalSum = 0;
	
	public Employee() {}
	
	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, double rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += this.rate*this.hours;
	}

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

	public double getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double salary () {
		return (this.hours * this.rate);
	}
	
	public void changeRate (double rate) {
		totalSum -= this.rate;
		this.rate = rate;
		totalSum += this.rate;
	}
	
	public double bonuses (int percent /*value of bonus in percent*/) {
		totalSum += this.salary() * (double)percent/100;
		return this.salary() * (double)percent/100;
	}
	
	public static double totalSalary () {
		
		return totalSum;
	}
	
	@Override
	public String toString() {
		return (this.name + " has rate " + this.rate + " and worked " + hours + " hours."
				+ " Salary " + this.salary()) + "$";
	}
	
}

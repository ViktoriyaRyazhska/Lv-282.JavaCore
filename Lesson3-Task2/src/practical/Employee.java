package practical;

public class Employee {
	
	private String name;
	private double rate;
	private double hours;
	
	private double bonus = 0;

	public static double totalSum = 0;
	

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
		totalSum += this.salary();
	}

	public double salary() {
		return this.rate*this.hours;
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
		totalSum += this.salary();
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) { //if HOURS have been set later as RATE, we upgrade salary
		totalSum -= this.salary();
		this.hours = hours;
		totalSum += this.salary();
	}

	public static double getTotalSum() {
		return totalSum;
	}
	
	public void changeRate(double rate) { //if RATE has been set later as HOURS, we upgrade salary
		totalSum -= this.salary();
		this.rate = rate;
		totalSum += this.salary();
	}
	
		
	public double bonuses() {
		totalSum -= this.bonus; //remove previous bonus from totalSum
		this.bonus += this.salary()*0.1; //upgrade bonus
		totalSum += this.bonus; // upgrade totalSum with new bonus
		return this.bonus;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", salary=" + this.salary() + ", bonus = " + this.bonus + "]";
	}


	
	
	

}

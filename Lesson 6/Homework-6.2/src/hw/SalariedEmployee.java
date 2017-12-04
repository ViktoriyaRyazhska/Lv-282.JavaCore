package hw;

public class SalariedEmployee extends Employee implements CalculatePay, CreateNewSalariedEmployee {

	private String socialSecurityNumber = "";

	private double rate = 0;
	private double hours = 0;

	public SalariedEmployee(int id, String name) {
		super(id, name);
		this.rate = setRate();
		this.hours = setHours();
		this.socialSecurityNumber = getUniqueId();
	}

	@Override
	public double calculatePay() {
		// "the average monthly salary = hourly rate * number of hours worked"
		return rate * hours;
	}

	public String getSocialSecurityNumber() {
		return ("SocialSecurityNumber " + socialSecurityNumber);
	}

	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee, socialSecurityNumber=" + socialSecurityNumber + ", salary="
				+ df.format(calculatePay());
	}

}

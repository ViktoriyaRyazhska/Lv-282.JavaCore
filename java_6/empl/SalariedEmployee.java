package lesson6.empl;

public class SalariedEmployee extends Employee implements IPay{

	private String socialSecurityNumber;
	private double fixedMonthlyPayment;
	
	public SalariedEmployee(String name, String employeeld, String nameOfCompany, String socialSecurityNumber,
			double fixedMonthlyPayment) {
		super(name, employeeld, nameOfCompany);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public double calculatePay() {
		return fixedMonthlyPayment;
	}

	@Override
	public String toString() {
		return "Employee ID: " + getEmployeeld() + " " + getName() + " worked for salary and has average monthly wage: " + String.format("%.2f", calculatePay());
	}
	
}


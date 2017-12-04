
public class SalariedEmployee extends Employee implements PayInterface{

	private int fixedMonthlyPayment;
	private String socialSecurityNumber;
	
	public SalariedEmployee(String empId, int fixedMonthlyPayment, String socialSecurityNumber) {
		super(empId);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public double calculatePay() {
		return fixedMonthlyPayment;
	}

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public String toString() {
		return "Employee ID: " + getEmpId() + " .Social security nimber: " + getSocialSecurityNumber()
		+ " .Average monthly wage: " + calculatePay();
	}
	
}

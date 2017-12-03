package lesson6.empl;

public class ContractEmployee extends Employee implements IPay {
	
	private String federalTaxIdmember;
	private double hourlyRate;
	private double numberOfHoursWorked;
	
	public ContractEmployee(String name, String employeeld, String nameOfCompany, String federalTaxIdmember,
			double hourlyRate, double numberOfHoursWorked) {
		super(name, employeeld, nameOfCompany);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	@Override
	public double calculatePay() {
		return this.hourlyRate * this.numberOfHoursWorked;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(double numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	@Override
	public String toString() {
		return "Employee ID: " + getEmployeeld() + " " + getName() + " worked by contract and has average monthly wage: " + String.format("%.2f", calculatePay());
	}
	
	
}

//Output the employee ID, name, and the average monthly wage for all elements of the list.





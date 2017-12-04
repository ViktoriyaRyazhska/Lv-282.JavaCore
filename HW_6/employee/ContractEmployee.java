
public class ContractEmployee extends Employee implements PayInterface{
	
	private int hourlyRate;
	private int hoursWorked;
	private String federalTaxIdmember;
	
	public ContractEmployee(String empId, int hourlyRate, int hoursWorked, String federalTaxIdmember) {
		super(empId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public double calculatePay() {
		return hourlyRate * hoursWorked;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	
	@Override
	public String toString() {
		return "Employee ID: " + getEmpId() + " .Federal tax number: " + getFederalTaxIdmember()
		+ " .Average monthly wage: " + calculatePay();
	}
	
	
}

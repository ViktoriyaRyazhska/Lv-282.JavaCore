package inheritanc;

public class ContractEmployee extends Employee implements inEmploy {
	
	
	public int federalTaxIdmember;
	
	@Override
	public void calculatePay() {
		averMonthlySalary = hourlyRate * numbOfHoursWork;
		//System.out.println("������� �������� ����� " + averMonthlySalary);
		super.calculatePay();
	}
}

package inheritanc;

public class SalariedEmployee extends Employee implements inEmploy {
	
	
	public String socialSecurityNumber;
	

	@Override
	public void calculatePay() {
		 averMonthlySalary=fixedMonthlyPay;
		 //System.out.println("������� �������� ����� " + averMonthlySalary);
		super.calculatePay();
	}

}

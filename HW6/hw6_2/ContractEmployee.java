package hw6_2;

public class ContractEmployee  extends  Employee implements calculatePay {

	private double federalTaxIdmember;
	private int fixed_monthly_payment;



	


	public ContractEmployee(String employeeld, double federalTaxIdmember, int fixed_monthly_payment) {
		super(employeeld);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixed_monthly_payment = fixed_monthly_payment;
	}

	public double getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(double federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	public int getFixed_monthly_payment() {
		return fixed_monthly_payment;
	}

	public void setFixed_monthly_payment(int fixed_monthly_payment) {
		this.fixed_monthly_payment = fixed_monthly_payment;
	}


	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", fixed_monthly_payment="
				+ fixed_monthly_payment + "]";
	}






	@Override
	public double calculatePay() {		
		return (double)fixed_monthly_payment;
	}

}

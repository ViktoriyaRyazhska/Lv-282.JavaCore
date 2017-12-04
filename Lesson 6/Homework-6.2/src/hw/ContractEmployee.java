package hw;

public class ContractEmployee extends Employee implements CalculatePay, CreateNewContractEmployee {

	private String federalTaxIdMember;

	private double fixPayment = 0;

	public ContractEmployee(int id, String name) {
		super(id, name);
		this.fixPayment = setFixPayment();
		this.federalTaxIdMember = getUniqueId() + "-00";
	}

	@Override
	public double calculatePay() {
		// "the average monthly salary = fixed monthly payment“
		return fixPayment;
	}

	public String getFederalTaxIdMember() {
		return ("FederalTaxIdMember " + federalTaxIdMember);
	}

	@Override
	public String toString() {
		return super.toString() + "ContractEmployee, federalTaxIdMember=" + federalTaxIdMember + ", salary="
				+ df.format(calculatePay());
	}

}

package hw;

public interface CreateNewContractEmployee {

	public double fixPayment = 0;

	public default double setFixPayment() {
		return Math.random() * 10000 + 2000;
	}

}

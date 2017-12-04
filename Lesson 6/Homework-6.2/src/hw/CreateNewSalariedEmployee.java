package hw;

public interface CreateNewSalariedEmployee {

	public double rate = 0;
	public double hours = 0;

	public default double setRate() {
		return Math.random() * 100 + 1;
	}

	public default double setHours() {
		return Math.random() * 150 + 1;
	}

}

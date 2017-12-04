package hw;

import java.util.UUID;

public interface CalculatePay {

	public double calculatePay();

	// text-id-generator
	public default String getUniqueId() {
		return UUID.randomUUID().toString().substring(0, 7);
	}

}

package hw;

import java.io.BufferedReader;
import java.io.IOException;

public class FloatNumber {
	
	private float floatNumber = 0;
	
	public FloatNumber (BufferedReader br) throws NumberFormatException, IOException {
		System.out.println();
		System.out.println("Input your float number:");
		this.floatNumber = Float.parseFloat(br.readLine());
		
	}
	
	
	public void compareFloat() {
		if ((this.floatNumber>=-5)&&(this.floatNumber<=5)) {
		System.out.println("Perfect!");
		}else {
			System.out.println("You are out of range...");
		}
	}
	

}

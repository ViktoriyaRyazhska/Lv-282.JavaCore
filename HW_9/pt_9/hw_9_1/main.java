package hw_9_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	while(true) {
		System.out.println("Enter two real numbers: ");
		try {
			double d1 = Double.parseDouble(br.readLine());
			double d2 = Double.parseDouble(br.readLine());
			
			double div = div(d1,d2);
			System.out.println(d1 + "/" + d2 + " = " + div);
		} catch (NumberFormatException e) {
			System.err.println("You entered incorect data! You need to enter only float\n");
			continue;
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			continue;
		}
		System.out.println("Do you want to run this aplication again? ('1' - no, smth else - yes)");
		byte var = Byte.parseByte(br.readLine());
		
		if(var == 1)
			break;
	}
	}

	public static double div(double d1, double d2) throws IllegalArgumentException {
		
		if(d2 == 0)
			throw new IllegalArgumentException("Error! Denominator is 0\n");	//1. Dividing by zero exception
		
		return d1/d2;
	}
	
}

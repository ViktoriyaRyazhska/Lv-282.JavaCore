package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatNumMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter three numbers in format 0.0 : ");
		FloatNum num1 = new FloatNum(Float.parseFloat(br.readLine()));
		FloatNum num2 = new FloatNum(Float.parseFloat(br.readLine()));
		FloatNum num3 = new FloatNum(Float.parseFloat(br.readLine()));
		
		num1.checkFloat();
		num2.checkFloat();
		num3.checkFloat();
	}
}

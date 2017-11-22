package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double PI = 3.1415;
		System.out.println("Please, enter radius of a bed");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double radius = Double.parseDouble(br.readLine());
		
		System.out.println("Perimetr of bed equal to " + String.format("%.3f", (2*PI*radius)));
		System.out.println("Area of bed equel to " + String.format("%.3f", (PI*radius*radius)));
		
	}

}

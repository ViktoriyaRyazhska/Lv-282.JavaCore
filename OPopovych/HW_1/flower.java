package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flower {

	public static void main(String[] args) throws NumberFormatException , IOException { 
		
		BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));
 	
		System.out.println("Enter the radius of the flower bed");
		double radius = Double.parseDouble(br.readLine()); 
       
		double area = Math.PI * Math.pow(radius, 2) ;
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Area = "+ area);
		System.out.println("Perimeter = "+perimeter);
	}

}

package java_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AT5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double[] side = new double[3]; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input a");
		side[0] = Double.parseDouble(br.readLine());
		System.out.println("Input b");
		side[1] = Double.parseDouble(br.readLine());
		System.out.println("Input c");
		side[2] = Double.parseDouble(br.readLine());
			
		Arrays.sort(side);
	
		System.out.println("=================================");
		
		if ( side[2]*side[2] > (side[1]*side[1] + side[0]*side[0]) ) {
			System.out.println(0);
		} else if ((side[2] == side[1]) && (side[2] == side[0])) {
			System.out.println(3);
		} else if ((side[0] == side[1]) || (side[2] == side[1])) {
			System.out.println(2);
		} else {
			System.out.println(1);
		}
			
	}

}

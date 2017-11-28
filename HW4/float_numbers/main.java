package float_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.println("enter float numbers");			
		float flo = Float.parseFloat(br.readLine());
		 float_numbers flo_nam = new  float_numbers();
		 flo_nam.setNumbers(flo);
		 System.out.println(flo_nam.getNumbers());

			
	
		if((flo_nam.getNumbers()>=-5.0)&&(flo_nam.getNumbers()<=5.0)){
			System.out.println("Super [-5,5]");
		}
		else {
			System.out.println("Error [-5,5]");
		}

	}}



	
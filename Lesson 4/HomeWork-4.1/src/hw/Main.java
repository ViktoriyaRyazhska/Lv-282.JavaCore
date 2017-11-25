package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		while (true) {
		
		System.out.println("What task do you want? A B or C? Exit = x");
		
		switch (br.readLine().toLowerCase()){
		
		case ("a"):
			System.out.println("We will check if your 3 float numbers are inside range [-5,5]");
			
			FloatNumber fn1 = new FloatNumber(br);
			fn1.compareFloat();
						
			FloatNumber fn2 = new FloatNumber(br);
			fn2.compareFloat();

			FloatNumber fn3 = new FloatNumber(br);
			fn3.compareFloat();
			
			System.out.println();
			
		break;
			
		case ("b"):
			System.out.println("Max and Min number");
			
			IntNumber in1 = new IntNumber(br);
			IntNumber in2 = new IntNumber(br);
			IntNumber in3 = new IntNumber(br);
			
			IntNumber.checkMaxMin();
			
			System.out.println();
			
		break;
					
		case ("c"):
			System.out.println("HTTP Error");
		
			System.out.println();
			System.out.println("Input Error number:");
			
			int httpError = Integer.parseInt(br.readLine());
			int count = 0;
			
			for (HTTPError error : HTTPError.values()) {
				if (httpError == error.getErr()) {
					System.out.println(error);
					count ++;
				}
			}
				
			if (count == 0) {
				System.out.println("There is no Error like this...");
			}
			
			System.out.println();
			
		break;	
		
		case ("x"):
			System.exit(0);
			
		default:
			System.out.println("You can choose only A B or C. Try again! Exit = x");
			System.out.println();
		}
		
		
		}
	}

}

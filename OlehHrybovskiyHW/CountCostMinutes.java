package ThreeTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountCostMinutes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//first country
		
		System.out.println("In what country did you call? ");
		String c1 = br.readLine();
		
		System.out.println("how many minutes did you call " + c1 + " ?");
		int t1 = Integer.parseInt(br.readLine());
		
		System.out.println("How mach usd per minute?");
		int upm1 = Integer.parseInt(br.readLine());
		
		System.out.println("You spent on the call to " + c1 + " " + upm1*t1 + " usd");
		
		// second country
		
		System.out.println("In what country did you call? ");
		String c2 = br.readLine();
		
		System.out.println("how many minutes did you call " + c2 + " ?");
		int t2 = Integer.parseInt(br.readLine());
		
		System.out.println("How mach cost usd per minute?");
		int upm2 = Integer.parseInt(br.readLine());
		
		System.out.println("You spent on the call to " + c2 + " " + upm2*t2 + " usd");
		
		//third country
		System.out.println("In what country did you call? ");
		String c3 = br.readLine();
		
		System.out.println("how many minutes did you call " + c3 + " ?");
		int t3 = Integer.parseInt(br.readLine());
		
		System.out.println("How mach cost usd per minute?");
		int upm3 = Integer.parseInt(br.readLine());
		
		System.out.println("You spent on the call to " + c3 + " " + upm3*t3 + " usd");
		
		System.out.println("Total cost " + (upm1 * t1 + upm2 * t2 + upm3 * t3) + " usd");
		
	}

}

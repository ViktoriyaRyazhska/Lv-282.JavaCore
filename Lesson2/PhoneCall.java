package Lesson2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCall {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter one minute cost of a phone call for the first country: ");
		Double c1 = Double.parseDouble(br.readLine());
		System.out.print("Enter one minute cost of a phone call for the second country: ");
		Double c2 = Double.parseDouble(br.readLine());
		System.out.print("Enter one minute cost of a phone call for the third country: ");
		Double c3 = Double.parseDouble(br.readLine());
		
		System.out.print("Enter the duration in minutes for the first phone call: ");
		Integer t1 = Integer.parseInt(br.readLine());
		System.out.print("Enter the duration in minutes for the second phone call: ");
		Integer t2 = Integer.parseInt(br.readLine());
		System.out.print("Enter the duration in minutes for the third phone call: ");
		Integer t3 = Integer.parseInt(br.readLine());
		
		System.out.println("Phone call cost for the first country = "+(c1*t1)+"$");
		System.out.println("Phone call cost for the first country = "+(c2*t2)+"$");
		System.out.println("Phone call cost for the first country = "+(c3*t3)+"$");
		System.out.println("Total cost = "+(c1*t1+c2*t2+c3*t3)+"$");
	}

}

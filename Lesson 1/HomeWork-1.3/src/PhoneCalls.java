import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class PhoneCalls {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("Price per 1 minute for France = ");
		double c1 = Double.parseDouble(br.readLine());
		
		System.out.print("Price per 1 minute for Germany = ");
		double c2 = Double.parseDouble(br.readLine());
		
		System.out.print("Price per 1 minute for Italy = ");
		double c3 = Double.parseDouble(br.readLine());
		
		System.out.println();
	
		
		
		System.out.print("Time, spent on phone callings to France = ");
		double t1 = Double.parseDouble(br.readLine());
		
		System.out.print("Time, spent on phone callings to Germany = ");
		double t2 = Double.parseDouble(br.readLine());
		
		System.out.print("Time, spent on phone callings to Italy = ");
		double t3 = Double.parseDouble(br.readLine());
		
		System.out.println();
		
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("------------ PHONE BILL ------------");
		System.out.println("FRANCE  : " + df.format(t1) + " min X " + df.format(c1) + " = " + df.format(t1*c1) + " EUR");
		System.out.println("GERMANY : " + df.format(t2) + " min X " + df.format(c2) + " = " + df.format(t2*c2) + " EUR");
		System.out.println("ITALY   : " + df.format(t3) + " min X " + df.format(c3) + " = " + df.format(t3*c3) + " EUR");
		System.out.println("------------------------------------");
		System.out.println("TOTAL   :                   " + df.format(t1*c1 + t2*c2 + t3*c3) + " EUR");
				
	}

}

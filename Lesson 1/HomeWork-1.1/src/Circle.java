import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Circle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("Input radius: ");
		
		double r = Double.parseDouble(br.readLine());
		
		DecimalFormat df = new DecimalFormat("0.0000");
		
		System.out.println("Perimeter = " + df.format(Math.PI*r*2));
		System.out.println("Area = " + df.format(Math.PI*Math.pow(r, 2)));

	}

}

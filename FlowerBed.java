import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Input radius (in meters) of flower bed:");
		double r = Double.parseDouble(br.readLine());
		
		System.out.println("Perimeter is " + (2*3.14*r) + " m");
		System.out.println("Area is " + (3.14*r*r) + " m^2");
	}

}

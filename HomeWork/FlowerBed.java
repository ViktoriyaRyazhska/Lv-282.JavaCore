import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input radius of the flowerbed");
		Double radius = Double.parseDouble(br.readLine());	
					
		double perimeter = 2*radius*Math.PI;
		double area = 2*Math.PI*Math.pow(radius, 2);
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
	}

}
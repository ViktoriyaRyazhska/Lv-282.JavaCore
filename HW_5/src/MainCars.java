import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCars {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		Cars[] car = new Cars[4];
		
		car[0] = new Cars("SUV",1994,2);
		car[1] = new Cars("Sportcar",2013,6.5);
		car[2] = new Cars("Logan",2013,1.5);
		car[3] = new Cars("Zhigul",1982,1.3);
		
		System.out.println("Enter the year of production:");
		int year = Integer.parseInt(br.readLine());
		Cars.displayCarsByYear(car, year);
		System.out.println();
		
		System.out.println("Cars after sorting by year:");
		Cars.orderByYear(car);
		Cars.displayCars(car);
	}

}

package hw_5_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter year a car");
		int year=Integer.parseInt(br.readLine());
       Car[] car = new Car[4];
       car[0]=new Car("Honda", 1985, 2);
       car[1]=new Car("BMW", 2000, 1.6);
       car[2]=new Car("BMW", 2001, 1.6);
       car[3]=new Car("Aveo", 1985, 2.2);
       
       
       for (int i = 0; i < car.length; i++) {
		if(year==car[i].getYear()) {
			System.out.println(car[i]);
			
		}
	}
       System.out.println();
       Car.ordered_by_the_field_year(car);
      
       
       

	}

}

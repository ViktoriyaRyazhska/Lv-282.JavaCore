package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Car car1 = new Car(CarType.AUDI, 2003, 1.9);
		Car car2 = new Car(CarType.AUDI, 2009, 2.5);
		Car car3 = new Car(CarType.OPEL, 2001, 1.6);
		Car car4 = new Car(CarType.MERSEDES, 2015, 4.0);

		Car[] cars = { car1, car2, car3, car4 };

		System.out.println("Enter year");

		int certainYear = Integer.parseInt(br.readLine());

		int count = 0;
		for (Car car : cars) {
			if (car.getYear() == certainYear) {
				System.out.println(car);
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("We have no car from this year");
		}

		System.out.println();
		System.out.println("Ordered array of cars:");

		Car tempCar;

		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYear()>cars[j].getYear()) {
					tempCar = cars[i];
					cars[i] = cars[j];
					cars[j] = tempCar;					
				}
			}
		}

		for (Car car : cars) {
			System.out.println(car);
		}

	}

}

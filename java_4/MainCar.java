package java_4;

import java.io.IOException;

public class MainCar {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Car[] cars = new Car[4];
		
		cars[0] = new Car("Renault", 2015, 1.5);
		cars[1] = new Car("Opel", 1995, 1.1);
		cars[2] = new Car("VW", 2011, 1.9);
		cars[3] = new Car("BMW", 2015, 3.0);
		
		System.out.println("Enter year of car's production");
		Car.showCarByYear(cars, Integer.parseInt(CarUtil.readline()));
		
	}
	
	
}



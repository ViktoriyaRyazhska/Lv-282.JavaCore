package java_4;

import java.io.IOException;
import java.util.Calendar;
public class Car {

	private String type;
	private int yearOfProduction;
	private double engineCapacity;
	
	public Car(String type, int yearOfProduction, double engineCapacity) throws NumberFormatException, IOException {
		this.type = type;
		this.engineCapacity = engineCapacity;
		this.yearOfProduction = returnCorectYear(yearOfProduction);
	}
	
	
	private static int returnCorectYear(int year) throws NumberFormatException, IOException {
		if (isCorrectYearProduction(year)) {
			return year;
		} else {
			do {
				System.out.println("Year of production should be between 1970 and " + Calendar.getInstance().get(Calendar.YEAR) 
			
								+ " years");
				System.out.println("Please, enter correct year of prodaction");
				year = Integer.parseInt(CarUtil.readline());
			} while (!isCorrectYearProduction(year));
			return year;
		}
	}
	
	private static boolean isCorrectYearProduction(int year) {
		
		
		if ( (year >= 1970) && ( year <= Calendar.getInstance().get(Calendar.YEAR)) ){
			return true;
		}
		return false;
	}
	
	public String getType() {
		return type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}
	
	public static void showCarByYear(Car[] cars, int year) throws NumberFormatException, IOException {
		int count = 0;
		year = returnCorectYear(year);
		System.out.println("In year " + year + " was made: ");
		
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getYearOfProduction() == year ) {
				System.out.println("   - " + cars[i].getType() + " with engine " + cars[i].getEngineCapacity());
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("  - No cars were was made in " + year + " year");
		}
		
		
		
	}
	
	
}

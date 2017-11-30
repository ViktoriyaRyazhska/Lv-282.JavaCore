package hw_5_5;

import java.io.BufferedReader;

public class Car {
	private String name;
	private int year;
	private double engine_capacity;	
	
	

	public Car(String name, int year, double engine_capacity) {
		this.name = name;
		this.year = year;
		this.engine_capacity = engine_capacity;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(double engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + ", engine_capacity=" + engine_capacity + "]";
	}
	
public static void ordered_by_the_field_year(Car[] car) {
	for (int i = 0; i < car.length; i++) {
		for (int j = i+1; j < car.length; j++) {
			if (car[i].year > car[j].year) {
				Car temp = car[j];
				car[j] = car[i];
				car[i] = temp;
			}
		}
		System.out.println(car[i].toString());
	}
}
	
	
	
}

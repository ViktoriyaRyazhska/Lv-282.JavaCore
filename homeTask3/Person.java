package homeTask3;

import java.util.Calendar;

public class Person {
	
	private String name;
	private int birthYear;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public Person() {
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public int age() {
		return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
	}
	
	public void input(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public void output() {
		System.out.println("The " + this.name + " was born in " + this.birthYear);
	}
	
	public void changeName(String name) {
		System.out.println("For Person " + this.name + " name was change to " + name);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return ("Person " + this.name + " was born in " + this.birthYear + " and have " + this.age());
	}
	
	
}

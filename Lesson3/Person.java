package lesson3;

public class Person {

	private String name;
	private int birthYear;
	private final int date = 2017;

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

	public int getDate() {
		return date;
	}

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public int age() {
		return date - getBirthYear();
	}

	public void input(String name) {
		this.name = name;
	}

	public void input(int birthYear) {
		this.birthYear = birthYear;
	}

	public void ChangeName(String name) {
		this.name = name;
	}

	public void output() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + ", age()=" + age() + "]";
	}

}
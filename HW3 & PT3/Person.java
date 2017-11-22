import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;

public class Person {
	private String name;
	private int birthYear;
		
	
	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
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
	
	public int PersonAge() {
		return Year.now().getValue() - this.birthYear;
	}
	
	public void input () throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Name of person: ");
		this.name = br.readLine();
		
		System.out.println("Year of birth:");
		this.birthYear = Integer.parseInt(br.readLine());
	}
	
	public void output () {
		System.out.println("Name of person: " + this.name);
		System.out.println("Year of birth: " + this.birthYear);
	}
	
	public void changeName (String name) {
		this.name = name;
	}
	
}

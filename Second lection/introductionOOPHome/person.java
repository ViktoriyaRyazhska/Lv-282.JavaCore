import java.time.LocalDate;
import java.util.Scanner;

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
	@Override
	public String toString() {
		return "Person name=" + this.name + ", birthYear=" + this.birthYear ;
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public int PersonAge ()
	{
		return birthYear =  
				LocalDate.now().getYear() - this.birthYear;
	}
	
	public void Input(){
		System.out.println("Input your name!");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Input your birth day");
		int age = sc.nextInt();
		sc.close();
		System.out.println("Hello : " + name +  "  you born: " + age);
		 
	}
	
	public void Output(){
		System.out.println("Your name is : " + this.name +  " and you born: " + this.birthYear);
		
	}

	public void changename(String name){
		this.name = name;
	}
}

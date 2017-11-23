package Hom_Wo_r3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String Name;
	private int  birthYear ;	
	
	public Person() {
	}
	

	
	public Person(String name, int birthYear) {
		this.Name = name;
		this.birthYear = birthYear;
	}
	
 
	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getBirthYear() {
		return birthYear;
	}



	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	//to calculate the age
	
	public  int age() {	
		 int x=2017-birthYear;
		return x;
	}
	
	//to input information about person
	public void input_Person() throws IOException ,NumberFormatException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("input name");
		Name=br.readLine();
		System.out.println("input birthYear");
		birthYear=Integer.parseInt(br.readLine());
		
	}
	
	// to output information about person
	public Object output_Person()  {		
		return toString();
	}

	//to change the name of person
	public Object changeName() throws IOException ,NumberFormatException,NullPointerException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("change the name");
		Name=br.readLine();
		return output_Person();
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", birthYear=" + birthYear + ", Age=" +age()+" ]";
	}


	
	
		
	

}

package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class PersonMain {

	public static void main(String[] args) throws ParseException, IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));


		Person p1 = new Person("Alex", 2000);
		
		Person p2 = new Person();
		p2.setName("Vasya");
		p2.setBY(1980);
		
		Person p3 = new Person();
		p3.input(br);
		
		Person p4 = new Person("Andriy", 1992);
		p4.changeName(br);
		
		Person p5 = new Person("Ira", 1996);
		
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
		
	}

}

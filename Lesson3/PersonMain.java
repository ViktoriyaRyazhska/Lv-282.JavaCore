package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class PersonMain {

	public static void main(String[] args) throws ParseException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Person person1 = new Person("Ihor", 1985);

		Person person2 = new Person();
		person2.setName("Ira");
		person2.setBirthYear(1998);

		Person person3 = new Person();
		System.out.println("Input name");
		person3.input(br.readLine());

		System.out.println("Input birthYear, format YYYY");
		person3.input(Integer.parseInt(br.readLine()));

		Person person4 = new Person("Vasyl", 1967);

		Person person5 = new Person("Yana", 1987);

		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();

		System.out.println("Change name for " + person4.getName() + " : ");
		person4.ChangeName(br.readLine());

		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
	}

}
package homeTask3;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person1 = new Person("Abram", 1970);
		Person person2 = new Person("Brian", 1975);
		Person person3 = new Person("Claudia", 1980);
		Person person4 = new Person("Davon", 1985);
		Person person5 = new Person("Enver", 1990);
		
		print(person1, person2, person3, person4, person5);
		
		person3.changeName("Carolina");
		
		print(person1, person2, person3, person4, person5);
		

	}

	private static void print(Person person1, Person person2, Person person3,Person person4, Person person5) {
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5 + "\n");
	}
	
	
}

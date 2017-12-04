package classWork;

public class Main {

	public static void main(String[] args) {


		
		Person[] persons = new Person[5];
		
		persons[0] = new Teacher("Petro");
		persons[1] = new Student("Vasia");
		persons[2] = new Student("Olya");
		persons[3] = new Teacher("Katerina Ivanivna");
		persons[4] = new Cleaner("Igor");
		
		for (Person person : persons) {
			person.print();
			if (person instanceof Staff) {
				((Staff)person).salary();
			}
			System.out.println();
			
		}
	}

}

package lw6._2;

public class Main {

	public static void main(String[] args) {
		Person[]persons=new Person[8];
		persons[0]=new Student("Vova");
		persons[1]=new Cleaner("Vika");
		persons[2]=new Teachers("Olga");
		persons[3]=new Teachers("Boris");
		persons[4]=new Cleaner("Anna");
		persons[5]=new Teachers("Ira");
		persons[6]=new Teachers("Hanna");
		persons[7]=new Student("Ihor");
		
		for (Person person : persons) {
			person.print();
			System.out.println();
		}
		
		for (Person person2 : persons) {
			if(person2 instanceof Staff) {
		((Staff)person2).salary();
			
		}}

	}

}

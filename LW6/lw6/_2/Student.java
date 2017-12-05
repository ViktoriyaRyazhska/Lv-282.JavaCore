package lw6._2;

public class Student extends Person{
	
	TYPE_PERSON type_person;
	
	
	

	public Student(String name) {
		super();
		this.type_person = type_person;
		setName(name);
	}


 
 

	@Override
	public void print() {
		System.out.println("Name "+getName());
		System.out.println("I am a "+type_person.STUDENT );
		
		
	}
	

}

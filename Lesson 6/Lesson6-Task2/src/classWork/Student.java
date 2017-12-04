package classWork;

public class Student extends Person {
	
	final String TYPE_PERSON = "STUDENT";
	
	
	
	public Student(String name) {
		setName(name);
	}

	@Override
	public void print() {
		System.out.println("My name is " + getName());
		System.out.println("I am a " + TYPE_PERSON);
	}

}

package classWork;

public class Teacher extends Staff {
	
	final String TYPE_PERSON = "TEACHER";
	
	public Teacher(String name) {
		setName(name);
	}

	@Override
	public void salary() {

		System.out.println("Salary = 10 000");
	}

	@Override
	public void print() {
		System.out.println("My name is " + getName());
		System.out.println("I am a " + TYPE_PERSON);
	}

}

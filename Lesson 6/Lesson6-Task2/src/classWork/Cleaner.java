package classWork;

public class Cleaner extends Staff {
	
	final String TYPE_PERSON = "CLEANER";
	
	public Cleaner(String name) {
		setName(name);
	}


	@Override
	public void salary() {
		System.out.println("Salary = 3 200");
	}

	@Override
	public void print() {
		System.out.println("My name is " + getName());
		System.out.println("I am a " + TYPE_PERSON);
	}

}

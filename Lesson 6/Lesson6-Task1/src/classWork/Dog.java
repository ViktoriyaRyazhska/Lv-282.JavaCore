package classWork;

public class Dog implements Animal{

	@Override
	public void voice() {
		System.out.println("I am Dog. I'm barking!");		
	}

	@Override
	public void feed() {
		System.out.println("I eat PEDIGREE!");		
	}

}

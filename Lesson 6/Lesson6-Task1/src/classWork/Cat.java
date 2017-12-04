package classWork;

public class Cat implements Animal {

	@Override
	public void voice() {
		System.out.println("I am Cat. I say MEOW!");
	}

	@Override
	public void feed() {
		System.out.println("I eat WHISKAS!");
	}

}

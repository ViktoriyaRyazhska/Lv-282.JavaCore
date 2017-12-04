package hw;

public class FlyingBird extends Bird {

	@Override
	public void fly() {
		System.out.println("I can fly!");
		System.out.println(toString());
		System.out.println();
	}

}

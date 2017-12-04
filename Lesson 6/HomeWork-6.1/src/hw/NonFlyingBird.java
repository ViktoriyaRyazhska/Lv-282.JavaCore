package hw;

public class NonFlyingBird extends Bird{

	@Override
	public void fly() {
		System.out.println("I can't fly...");
		System.out.println(toString());
		System.out.println();
	}

}

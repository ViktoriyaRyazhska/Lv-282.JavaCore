package hw;

public class Swallow extends FlyingBird{

	@Override
	public void fly() {
		System.out.println("I am " + getClass().getSimpleName());
		setFeathers("Black and white feather");
		setLayEggs(5);
		super.fly();
	}

}

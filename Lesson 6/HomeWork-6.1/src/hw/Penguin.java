package hw;

public class Penguin extends NonFlyingBird{


	@Override
	public void fly() {
		System.out.println("I am " + getClass().getSimpleName());
		setFeathers("Black and white feather");
		setLayEggs(1);
		super.fly();
	}

}

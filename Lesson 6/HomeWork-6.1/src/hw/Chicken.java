package hw;

public class Chicken extends NonFlyingBird {

	@Override
	public void fly() {
		System.out.println("I am " + getClass().getSimpleName());
		setFeathers("White feather");
		setLayEggs(50);
		super.fly();
	}

}

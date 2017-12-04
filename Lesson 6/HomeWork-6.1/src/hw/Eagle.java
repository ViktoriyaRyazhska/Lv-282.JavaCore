package hw;

public class Eagle extends FlyingBird{

	
	@Override
	public void fly() {
		System.out.println("I am " + getClass().getSimpleName());
		setFeathers("Brown feather");
		setLayEggs(2);
		super.fly();
	}

}

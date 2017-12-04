
public class Chicken extends NonFlyingBird {
	
	public Chicken(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("I am chicken and I can`t fly");
	}
	
	
}

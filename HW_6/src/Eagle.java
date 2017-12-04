
public class Eagle extends FlyingBird {

	public Eagle(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("I am eagle and I can fly");
	}
		
}

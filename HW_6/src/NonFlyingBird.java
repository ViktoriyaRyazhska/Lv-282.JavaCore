
public class NonFlyingBird extends Bird {

	public NonFlyingBird(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("I can`t fly");
		
	}

}

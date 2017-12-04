
public class Swallow extends FlyingBird{

	public Swallow(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("I am swallow and I can fly");
	}
	
}

package lesson6;

public class NonFlyingBird extends Bird{

	private int weight;

	public NonFlyingBird(boolean feathers, boolean layEggs, int weight) {
		super(feathers, layEggs);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	void fly() {
		System.out.println("I can't fly but I can walking");		
	}
	
	
	
	
}

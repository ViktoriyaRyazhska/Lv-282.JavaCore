package lesson6;

public class FlyingBird extends Bird{

	private String color;

	public FlyingBird(boolean feathers, boolean layEggs, String color) {
		super(feathers, layEggs);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	void fly() {
		System.out.println("I'm bird and I can fly");
	}
	
	
}

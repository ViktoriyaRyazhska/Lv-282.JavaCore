package lesson6;

public class Eagle extends FlyingBird{

	private double lengthWings;

	public Eagle(boolean feathers, boolean layEggs, String color, double lengthWings) {
		super(feathers, layEggs, color);
		this.lengthWings = lengthWings;
	}

	@Override
	public String getColor() {
		return super.getColor();
	}

	@Override
	void fly() {
		System.out.println("I'm Eagle and I'm super fly bird");
	}

	public double getLengthWings() {
		return lengthWings;
	}
	
	
}

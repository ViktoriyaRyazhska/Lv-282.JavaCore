package lesson6;

public class Swallow extends FlyingBird{
	
	private String placeOfLiving;

	public Swallow(boolean feathers, boolean layEggs, String color, String placeOfLiving) {
		super(feathers, layEggs, color);
		this.placeOfLiving = placeOfLiving;
	}

	@Override
	public String getColor() {
		return super.getColor();
	}

	@Override
	void fly() {
		System.out.println("I'm Swallow and I'm also like to fly");
	}

	@Override
	public boolean isFeathers() {
		return super.isFeathers();
	}

	@Override
	public boolean isLayEggs() {
		return super.isLayEggs();
	}

	public String getPlaceOfLiving() {
		return placeOfLiving;
	}
	
}

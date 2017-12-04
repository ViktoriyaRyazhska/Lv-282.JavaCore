
public abstract class Bird {
	private boolean feathers;
	private boolean layEggs;
	
	public void fly() {
		System.out.println("I am a bird");
	}

	public boolean isFeathers() {
		return feathers;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public Bird(boolean feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

}

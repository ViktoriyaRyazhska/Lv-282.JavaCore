package hw;

public abstract class Bird {

	private String feathers;
	private int layEggs;

	public abstract void fly();

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public int getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(int layEggs) {
		this.layEggs = layEggs;
	}

	@Override
	public String toString() {
		if (layEggs == 1) {
			return feathers + ", " + layEggs + " egg per year";
		} else if (layEggs <= 0) {
			return feathers + ", no eggs at all";
		} else {
			return feathers + ", " + layEggs + " eggs per year";
		}

	}

}

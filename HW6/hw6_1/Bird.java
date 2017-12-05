package hw6_1;

public abstract class Bird {
	
	
	
	public Bird() {
	
	}

	private String feathers;
	private int layEggs;
	
	
	
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
		return "Bird [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	  abstract void fly( );
	
	

}

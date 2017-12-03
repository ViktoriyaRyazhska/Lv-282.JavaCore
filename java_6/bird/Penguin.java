package lesson6;

public class Penguin extends NonFlyingBird {

	private int age;

	public Penguin(boolean feathers, boolean layEggs, int weight, int age) {
		super(feathers, layEggs, weight);
		this.age = age;
	}

	@Override
	public int getWeight() {
		return super.getWeight();
	}

	@Override
	void fly() {
		System.out.println("I'm a Penguin I can't fly");
	}

	public int getAge() {
		System.out.println("I'm a Penguin I'm " + this.age + " year old");
		return this.age;
	}
	
}

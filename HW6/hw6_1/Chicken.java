package hw6_1;

public class Chicken extends NonFlyingBird{
	
	private String chicken;
	
	
	
	public Chicken(String chicken) {
		super();
		this.chicken = chicken;
	}



	@Override
	void fly() {
		System.out.println(chicken);
		setFeathers("dark,black, white");
		System.out.println("I'm a chicken and I'm just walking");
		System.out.println(getFeathers());
		setLayEggs(3);
		System.out.println(getLayEggs());
		super.fly();
		
		
	}

}

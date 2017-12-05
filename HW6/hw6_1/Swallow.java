package hw6_1;

public class Swallow extends FlyingBird {
	
	private String swallow;
	
	
	
	public Swallow(String swallow) {
		super();
		this.swallow = swallow;
	}



	@Override
	void fly() {
		System.out.println(swallow);
		setFeathers("dark end black");
		System.out.println("I can fly between trees!");
		System.out.println(getFeathers());
		setLayEggs(2);
		System.out.println(getLayEggs());
		super.fly();
		
	}

}

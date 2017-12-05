package hw6_1;

public class Penguin extends NonFlyingBird{
	
	private String penguin;
	
	
	public Penguin(String penguin) {
		super();
		this.penguin = penguin;
	}


	@Override
	void fly() {
		System.out.println(penguin);
		setFeathers("dark");
		System.out.println("I'm Penguin end i'm funny to walk");
		System.out.println(getFeathers());
		setLayEggs(1);
		System.out.println(getLayEggs());
		super.fly();
		
	}
}

package hw6_1;

public class Eagle extends FlyingBird {
	
	private String eagle ;
	
	
	
	public Eagle(String eagle) {
		super();
		this.eagle = eagle;
	}



	


	@Override
	void fly() {
		System.out.println(eagle);
		setFeathers("dark gray");
		System.out.println("I can fly fast");
		System.out.println(getFeathers());
		setLayEggs(1);
		System.out.println(getLayEggs());
		super.fly();
		
		
		
		
	}

}

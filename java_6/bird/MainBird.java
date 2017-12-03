package lesson6;

public class MainBird {

	public static void main(String[] args) {
		
		Bird[] myBird = new Bird[4];
				
		myBird[0] = new Eagle(true, true, "grey", 2.4);
		myBird[1] = new Swallow(true, true, "black", "under roof");
		myBird[2] = new Penguin(false, false, 20, 3);
		myBird[3] = new Chicken(true, false, 2);
		
		
		
		myBird[0].fly();
		System.out.println("My color is " + ((FlyingBird) myBird[0]).getColor());
		System.out.println("Length of my wings is " + ((Eagle) myBird[0]).getLengthWings());
		
		myBird[1].fly();
		
		myBird[2].fly();
		
		myBird[3].fly();
		
		
		
		
		
		
		
		
	}

}


public class MainBird {

	public static void main(String[] args) {
		
		Bird[] bird = new Bird[4];
		
		bird[0] = new Eagle(true,true);
		bird[1] = new Chicken(true,false);
		bird[2] = new Penguin(false,true);
		bird[3] = new Swallow(true,true);
		
		System.out.println("Eagle:");
		bird[0].fly();
		System.out.println("Has a feathers? :" + bird[0].isFeathers());
		System.out.println("Lay eggs? :" + bird[0].isLayEggs());
		
		System.out.println("Chicken:");
		bird[1].fly();
		System.out.println("Has a feathers? :" + bird[1].isFeathers());
		System.out.println("Lay eggs? :" + bird[1].isLayEggs());
		
		System.out.println("Penguin:");
		bird[2].fly();
		System.out.println("Has a feathers? :" + bird[2].isFeathers());
		System.out.println("Lay eggs? :" + bird[2].isLayEggs());
		
		System.out.println("Swallow:");
		bird[3].fly();
		System.out.println("Has a feathers? :" + bird[3].isFeathers());
		System.out.println("Lay eggs? :" + bird[3].isLayEggs());
		
	}

}

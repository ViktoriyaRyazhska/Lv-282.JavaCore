

public class Inheritance_Main {
	public static void main(String[] args) {
		
		
		Bird bird[] = new  Bird[4];
		bird[0] = new Eagle();
		bird[1] = new Swallow();
		bird[2] = new Kiwi();
		bird[3] = new Penguin();
		for (int i=0; i<bird.length; i++) {
			bird[i].fly();
			if (bird[i].feathers)
				 System.out.println("It has teathers");
				else
				System.out.println("It not has teathers");
		}
	
	}

}

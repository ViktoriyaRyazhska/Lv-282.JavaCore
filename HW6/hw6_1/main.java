package hw6_1;

public class main {

	public static void main(String[] args) {
		
		Bird[] egl= {new Eagle("Eagle"),new Swallow("Swallow"),new Penguin("Penguin"),new Chicken("Chicken")};
		
		for (Bird bird : egl) {
			bird.fly();
			System.out.println();
			
		}
		

	}

}

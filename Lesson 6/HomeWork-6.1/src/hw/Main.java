package hw;

public class Main {

	public static void main(String[] args) {
		
		Bird[] birds = {new Swallow(), new Chicken(), new Penguin(), new Eagle(),
				new Eagle(), new Chicken(), new Swallow(), new Chicken(), new Eagle(), 
				new Penguin(), new Eagle()};
		
		for (Bird bird : birds) {
			bird.fly();
		}
		
	}
}

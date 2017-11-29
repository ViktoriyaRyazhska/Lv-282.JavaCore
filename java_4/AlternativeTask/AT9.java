package jcore4;

public class AT9 {
	
	public static void main(String[] args) {
	
		double y = Math.cos(40);
		
		for (int i = 39; i > 0; i--) {
			y = Math.cos(i+y);
		}
		
		System.out.println("y = " + y);
		
		
	}
	
	
}

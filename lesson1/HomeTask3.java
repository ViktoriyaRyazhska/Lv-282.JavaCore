package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] c = new int[3];
		int[] t = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Write the cost of call from " + (i+1) + " country");
			c[i] = Integer.parseInt(br.readLine());
			System.out.println("Write how mach minutes your tall continued");
			t[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Contry    cost     continued. Summary cost");
		System.out.println("______   ______   ___________ ______________");
		for (int i = 0; i < 3; i++ ) {
		System.out.println(" c[" + (i+1) + "]   " + c[i] + " unit      " + t[i] + " min       " + cost(c[i], t[i]) + " unit");
			
		}
		
	}
	
	public static int cost (int s, int t) {
		return s*t;
	} 
	
}

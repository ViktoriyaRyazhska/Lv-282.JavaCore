package FirstProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleAplication {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter value a");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter value b");
			
		int b = Integer.parseInt(br.readLine());
//			int c = a + b;
//			int d = a - b;
//			int e = a * b;
//			int f = a / b;
			
//		System.out.println("a + b = " + c);
//		System.out.println("a - b = " + d);
//		System.out.println("a * b = " + e);
//		System.out.println("a / b = " + f);
	
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		
	}

}

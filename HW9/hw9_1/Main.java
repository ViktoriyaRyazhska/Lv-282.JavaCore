package hw9_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {




	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws  IOException, intALess_0_Exception  {
		int a=intA();
		int b= intB();
		try {
		 div(a, b);
		}catch (ArithmeticException e) {
			System.out.println("by zero int b");
		}catch (NumberFormatException e) {
			System.out.println("wrong int");
		}
	}
	
	
	private static int intA() throws NumberFormatException, IOException {
		int a;
		System.out.println("Enter  int number a: ");
		return  a=Integer.parseInt(br.readLine());
	}
	private static int intB() throws NumberFormatException, IOException {
		int b;
		System.out.println("Enter  int number b: ");
		return  b=Integer.parseInt(br.readLine());
	}
	
	private static void div(int A,int B) {
		int div=A/B;
		System.out.println("div = "+div);
	}
	

}

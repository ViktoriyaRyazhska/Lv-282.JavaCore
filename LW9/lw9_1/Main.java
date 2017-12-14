package lw9_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	int A=number1();
	int B=number2();
	 zeroint(( number1()),number2());

		
		

	}
	public static  void squareRectangle (int a, int b) {
		int square;
		square=a*b;
		System.out.println("squareRectangle "+square);
		
	}
	public static int number1() throws NumberFormatException, IOException {
		System.out.println("Enter int-1");		
		int number1;
		return number1 = Integer.parseInt(br.readLine());
		
	}
	
	public static int number2() throws NumberFormatException, IOException {
		System.out.println("Enter int-2");
		int number2;
		return number2=Integer.parseInt(br.readLine());			
		
	}
	public static void zeroint( int a,int b) throws NumberFormatException, IOException {
	while(true)
		if(a>0&&b>0) {
			int A = a;
			int B = b;
			squareRectangle(A,B);
			break;
			
		}
		else {
			number1();		
			number2();
		}
	}
	

}

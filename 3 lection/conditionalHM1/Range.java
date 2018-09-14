import java.util.Scanner;

public class ComditionalHome1 {

	public static void main(String[] args) {
		System.out.println("Введіть число");
		Scanner sc = new Scanner(System.in);
		double chuslo = sc.nextDouble();
		sc.close();
			if ( chuslo > -5 || chuslo < 5){
				System.out.println(" Входить в межі від -5 до 5");
		} 
			else 
				
		{
				System.out.println("виходить за межі");
		}
	}
}
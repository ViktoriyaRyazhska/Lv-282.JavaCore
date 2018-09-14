import java.util.Scanner;

public class ConditionalHome2 {

	public static void main(String[] args) {
		System.out.println("введіть перше число з плаваючою точкою");
		Scanner a = new Scanner(System.in);
		float number = a.nextFloat();
		System.out.println("введіть друге число з плаваючою точкою");
		Scanner b = new Scanner(System.in);
		float number1 = b.nextFloat();
		System.out.println("введіть третє число з плаваючою точкою");
		Scanner c = new Scanner(System.in);
		float number2 = c.nextFloat();
		a.close();
		b.close();
		c.close();
		System.out.println(" Ви ввели: " + number + "; " + number1 + "; " + number2);
		
			 if(number < number1 && number < number2 ){
				 System.out.println("Найменше число:" + number);
			 }
			 if(number > number1 && number > number2 ){
				 System.out.println("Найбільше число:" + number);
			 }
			 if(number1 < number && number1 < number2 ){
				 System.out.println("Найменше число:" + number1);
			 }
			 if(number > number1 && number > number2 ){
				 System.out.println("Найбільше число:" + number1);
			 }
			 if(number2 < number1 && number2 < number ){
				 System.out.println("Найменше число:" + number2);
			 }
			 if(number2 > number1 && number2 > number ){
				 System.out.println("Найбільше число:" + number2);
			 }
			 
		 }
		
	}
	



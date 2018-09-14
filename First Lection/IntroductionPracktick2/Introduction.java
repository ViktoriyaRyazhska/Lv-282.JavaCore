import java.util.Scanner;

public class IntroductionPracktick2 {
	public static void main(String[] args) {
		boolean pomulka = false;
		do  {
			try {
		System.out.println("Hello! What is your name?)");
		Scanner n = new Scanner (System.in);
		String name =n.nextLine();
		System.out.println("Hello! " + name);
		System.out.println(name +  " " + "How are you?");
		String spravu = n.nextLine();
		System.out.println("You are" + " " + spravu );
		n.close();
		pomulka = false;}
			catch (Exception Pomulka){
				pomulka = true;
				System.out.println("Enter again");}}
		while (pomulka);
			
			
	}
}
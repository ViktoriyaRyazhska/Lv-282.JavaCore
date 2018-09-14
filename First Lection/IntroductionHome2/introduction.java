import java.util.Scanner;

public class IntroductionHome2 {

	public static void main(String[] args) {
		System.out.println("What is your name? ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Where do you live?  " + name );
		String adress =s.next();
		System.out.println("Your name is " + name + " ! " + "You live: " + adress);
		s.close();
	}

}

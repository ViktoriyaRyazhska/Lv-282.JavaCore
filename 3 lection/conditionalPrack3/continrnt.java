package conditionalPrack3;

import java.util.Scanner;

public class conditionalPrack3 {

	public static void main(String[] args) {
		System.out.println("Введіть одну з країн:Україна,Німеччина, Росія, Єгипет, АОЕ, Америка, Мексика");
		Scanner s = new Scanner(System.in);
		String contenent = s.nextLine();
		switch (contenent.toLowerCase()) {
		case "Україна": case "Німеччина":
			System.out.println("Ця країна на контененті : " +  enam.Europa); break;
		case " Росія":
			System.out.println("Ця країна на контененті : " +  enam.Azia); break;
		case "Єгипет": case "АОЕ": 
			System.out.println("Ця країна на контененті : " +  enam.Afruka); break;
		case "Америка": case " Мексика": 
			System.out.println("Ця країна на контененті : " +  enam.Ameruka); break;
		default:
			System.out.println("Нема такої країни)))");
			System.exit(0);
			s.close();
	}}}

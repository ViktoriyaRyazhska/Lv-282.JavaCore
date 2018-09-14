import java.util.Scanner;

public class IntroductionPracktik {

	public static void main(String[] args) {
		boolean yePomulka = false;
		do
		{
				try {
			int chusloA;
			int chusloB;
			System.out.println("Input A ");
			Scanner chuslo = new Scanner(System.in); 
	        chusloA = chuslo.nextInt();
	        System.out.println("Input B ");
	        chusloB = chuslo.nextInt();
	        chuslo.close();
	        System.out.println("you input "+ chusloA + " and " +  chusloB);
	        System.out.println("Обчислимо додавання:" + (chusloA + chusloB));
	        System.out.println("Обчислимо множення:" + (chusloA * chusloB));
	        System.out.println("Обчислимо діленняя:" + (chusloA / chusloB));
	        System.out.println("Обчислимо віднімання:" + (chusloA - chusloB));
			yePomulka = false;	}
				catch ( Exception pomelka) {
					yePomulka = true;
					System.out.println("Не коректне введення: ");
					}
				}
		while(yePomulka);	}}

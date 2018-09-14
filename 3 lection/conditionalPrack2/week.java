package conditionalPracktic2;

import java.util.Scanner;

public class conditionalPracktic2 {

	public static void main(String[] args) {
		System.out.println(" Введіть число від 1 до 7!!!");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		switch(number){
			case 1:
				System.out.println("Понеділок,Monday,Lundi");
				break;
			case 2:
				System.out.println("Вівторок,Tuesday,Mardi");
				break;
			case 3:
				System.out.println("Середа,Wednesday,Mercredi");
				break;
			case 4:
				System.out.println("Четвер,Thursday,Jeudi");
				break;
			case 5:
				System.out.println("П'ятниця,Friday,Vendredi");
				break;
			case 6:
				System.out.println("Субота,Saturday,Samedi");
				break;
			case 7:
				System.out.println("Неділя,Sunday,Dimanche");
				break;
		default:
		System.out.println("Некоректне введення");
		}
		s.close();

	}

}

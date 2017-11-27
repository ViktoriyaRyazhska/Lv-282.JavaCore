package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		 		
		System.out.print("Введіть вартість хвилини телефонного дзвінка для країни №1: ");
		Double c1 = Double.parseDouble(br.readLine());
		System.out.print("Введіть тривалість телефонного дзвінка №:1(хвилини): ");
		Double t1 = Double.parseDouble(br.readLine());
		System.out.println("Вартість телефонного дзвінка для країни №1 = "+(c1*t1));
		
				System.out.print("Введіть вартість хвилини телефонного дзвінка для країни №2: ");
				Double c2 = Double.parseDouble(br.readLine());
				System.out.print("Введіть тривалість телефонного дзвінка №:2(хвилини): ");
				Double t2 = Double.parseDouble(br.readLine());
				System.out.println("Вартість телефонного дзвінка для країни №2 = "+(c2*t2));
		
			System.out.print("Введіть вартість хвилини телефонного дзвінка для країни №3: ");
			Double c3 = Double.parseDouble(br.readLine());
			System.out.print("Введіть тривалість телефонного дзвінка №:3(хвилини): ");
			Double t3 = Double.parseDouble(br.readLine());
			System.out.println("Вартість телефонного дзвінка для країни №3 = "+(c3*t3)); 		
		
				System.out.println("Загальна вартість = "+(c1*t1+c2*t2+c3*t3));

	}

}

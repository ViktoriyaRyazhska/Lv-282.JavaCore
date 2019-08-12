package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnumMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter error number");
		int error = Integer.parseInt(br.readLine());
		for (HttpErrorEnum erEnum : HttpErrorEnum.values()) {
			if (error == erEnum.getError()) {
				System.out.println(error + " - " + erEnum);
				a = 1;
			}
		}
		if(a==0) {
			System.out.println("No such error in list");
		}
	}
}
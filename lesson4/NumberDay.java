package lesson4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberDay {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Input number of the day of the week: \t");
		int numberDay = Integer.parseInt(br.readLine());
		
		switch (numberDay) {
		case 1:
			System.out.println("��������, Monday, Montag");
			break;
		case 2:
			System.out.println("³������, Tuesday, Dienstag");
			break;
		case 3:
			System.out.println("������, Wednesday, Mittwoch");
			break;
		case 4:
			System.out.println("�������, Thursday, Donnerstag");
			break;
		case 5:
			System.out.println("�������, Friday, Freitag");
			break;
		case 6:
			System.out.println("������, Saturday, Samstag");
			break;
		case 7:
			System.out.println("�����, Sunday, Sonntag");
			break;
			default:
				System.out.println("Wrong!!!");
		}
	}
}
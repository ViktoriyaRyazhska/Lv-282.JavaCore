package classWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week {

	public static void main(String[] args) throws NumberFormatException, IOException {


		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
		System.out.println("Sinput number 1-7");
		
		switch (Integer.parseInt(br.readLine())) {
		case 1:
			System.out.println("monday, montag, ��������");
			break;
		case 2:
			System.out.println("tuesday, dienstag, �������");
			break;
		case 3:
			System.out.println("wednesday, mittwoch, ������");
			break;
		case 4:
			System.out.println("thursday, donnerstag, ������");
			break;
		case 5:
			System.out.println("friday, freitag, �'������");
			break;
		case 6:
			System.out.println("saturday, samstag, ������");
			break;
		case 7:
			System.out.println("sunday, sontag, �����");
			break;
			
		default:
			System.out.println("There is mistake somwhere");
			
		}
		
		
	}

}

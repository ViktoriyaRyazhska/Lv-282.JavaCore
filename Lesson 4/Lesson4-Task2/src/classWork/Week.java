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
			System.out.println("monday, montag, понед≥лок");
			break;
		case 2:
			System.out.println("tuesday, dienstag, в≥второк");
			break;
		case 3:
			System.out.println("wednesday, mittwoch, середа");
			break;
		case 4:
			System.out.println("thursday, donnerstag, четвер");
			break;
		case 5:
			System.out.println("friday, freitag, п'€тниц€");
			break;
		case 6:
			System.out.println("saturday, samstag, субота");
			break;
		case 7:
			System.out.println("sunday, sontag, нед≥л€");
			break;
			
		default:
			System.out.println("There is mistake somwhere");
			
		}
		
		
	}

}

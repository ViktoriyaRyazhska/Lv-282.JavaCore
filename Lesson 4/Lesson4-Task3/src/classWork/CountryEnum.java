package classWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountryEnum {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		Continent continent;
		
		switch (br.readLine().toLowerCase()) {
		
		case ("ukraine"):
			System.out.println(Continent.EUROPE);
		break;
		
		case ("usa") :
		case ("brazil"):
			System.out.println(Continent.AMERICA);
		break;
		
		case ("chad"):
			System.out.println(Continent.AFRICA);
		break;
		
		case ("india"):
			System.out.println(Continent.ASIA);
		break;
		
		default:
		System.out.println(Continent.ANTARCTIDA);
		
		}
		

		
		
		
		
	}

}



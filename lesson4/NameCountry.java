package lesson4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameCountry {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name of the country: \t");
		String nameCountry = br.readLine();
		
		switch (nameCountry.toLowerCase()) {
		case "ukraine":
		case "germany":
			System.out.println(Ñontinents.Europe);
			break;
		case "russia":
		System.out.println(Ñontinents.Asia);
		break;
		case "egypt":
		System.out.println(Ñontinents.Africa);
		break;
		default:
			System.out.println("Wrong country!!!");
		break;
		}

	}

}

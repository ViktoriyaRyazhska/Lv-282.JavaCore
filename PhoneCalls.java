import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Input call tariff in Ukraine (units per minutes), then input duration of this conversation:");
		double tariffUa = Double.parseDouble(br.readLine());
		double timeUa = Double.parseDouble(br.readLine());
		
		System.out.println("In USA:");
		double tariffUs = Double.parseDouble(br.readLine());
		double timeUs = Double.parseDouble(br.readLine());
		
		System.out.println("In Germany:");
		double tariffGe = Double.parseDouble(br.readLine());
		double timeGe = Double.parseDouble(br.readLine());
		
		System.out.println("In general, you spoke " + (timeGe+timeUa+timeUs) + " minutes and it cost you " + (tariffUa*timeUa+tariffGe*timeGe+tariffUs*timeUs) + " units");

	}

}

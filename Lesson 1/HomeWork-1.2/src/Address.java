import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Address {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
		
		String name = br.readLine();
		System.out.println("Hello, " + name + "! Where do you live?");
		
		String addr = br.readLine();
		
		System.out.println("Name: " + name);
		System.out.println("Address: " + addr);
		
	}

}

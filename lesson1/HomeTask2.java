package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask2 {

	public static void main(String[] args) throws IOException {
		
		String name;
		String address;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is you name");
		name = br.readLine();
		
		System.out.println("What is you address");
		address = br.readLine();
		
		System.out.println("You name is " + name + " and you live in " + address);
		
		
	}

}

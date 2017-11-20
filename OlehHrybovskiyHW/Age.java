package FirstProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Age {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("How are you?");
		String HAU = br.readLine();
		
		System.out.println("You are " + HAU);
	}

}

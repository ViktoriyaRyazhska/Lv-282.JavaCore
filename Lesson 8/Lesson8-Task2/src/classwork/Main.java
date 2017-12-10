/*
 * Enter surname, name and patronymic on the console as a variable of type String. 
 * Output on the console:
 *    surnames and initials
 *    name
 *    name, middle name and last name
 */

package classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static String name;
	private static String patronymic;
	private static String surname;

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 splitString(readConsole(br), " ");

		System.out.println(surname + " " + name.charAt(0) + "." + patronymic.charAt(0) + ".");
		System.out.println(name);
		System.out.println(name + " " + patronymic + " " + surname);

	}

	public static String readConsole(BufferedReader br) throws IOException {
		System.out.println("Input your Surname Name Patronomic");
		String stringConsole = br.readLine();

		return stringConsole;
	}

	public static void splitString(String string, String separator) {
		String[] words = string.split(separator);

		surname = words[0];
		name = words[1];
		patronymic = words[2];

	}

}

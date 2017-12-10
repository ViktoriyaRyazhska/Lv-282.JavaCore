/*
 * Implement a pattern for US currency: 
 * the first symbol "$", 
 * then any number of digits, 
 * dot and two digits after the dot. 
 * Enter the text from the console that contains 
 * several occurrences of US currency. 
 * Display all occurrences on the screen.
 */

package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// System.out.println("Input your string");
		// String text = br.readLine();

		String text = "I have $276.12. My friend has $12.00 USD. $1  $0.5  85.3 $12,03";

		Pattern p = Pattern.compile("\\$(\\d)+((\\.)?(\\,)?\\d{1,2})?");

		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + " ");
		}

	}

}

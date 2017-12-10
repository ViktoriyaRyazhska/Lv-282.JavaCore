/*
 *Enter a sentence that contains the words between more than one space. 
 *Convert all spaces, consecutive, one. 
 *For example, if we introduce the sentence 
 *"I    am      learning     Java   Core», 
 *we have to get the 
 *"I'm learning Java Core» 
 */

//Solution with Pattern

package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input your string");
		String text = br.readLine();

		Pattern p = Pattern.compile("[\\S]+[\\s]");
		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()));
		}

	}

}

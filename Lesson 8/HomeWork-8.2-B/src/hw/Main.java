/*
 *Enter a sentence that contains the words between more than one space. 
 *Convert all spaces, consecutive, one. 
 *For example, if we introduce the sentence 
 *"I    am      learning     Java   Core», 
 *we have to get the 
 *"I'm learning Java Core» 
 */

//Solution with String

package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input your string");
		String text = br.readLine();
		String text2 = text;
		int a, b;

		do {
			b = text2.length();
			text2 = text.replace("  ", " ");
			a = text2.length();
			text = text2;
		} while (a < b);

		System.out.println(text);
	}

}

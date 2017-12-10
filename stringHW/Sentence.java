package stringHW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;


public class Sentence {
	public static void FiveSentence (String a) {
		String[] words = a.split("\\s+");
		Longest(words);
		Revers(words[1]);
	}


public static void Longest(String[] a) {
	String bigest = a[0];
	int big_leng = a[0].length();
	for (int i=0; i<a.length-1; i++) {
		if (a[i].length()<=a[i+1].length()) {
			bigest = a[i+1];
			big_leng = a[i+1].length();
			
		}
		
	}
	System.out.println("The longest word is " + bigest + " number of it " + big_leng);	
	}

public static void Revers (String a) {
	StringBuilder builder = new StringBuilder(a);
	System.out.println(builder.reverse());
	
	}
public static void Spaces (String a) {
	String pattern = "[a-z]+";
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(a);
	while (m.find()) {
		System.out.print(a.substring(m.start(), m.end()) + " ");
		}

	}
public static void Dollar (String a) {
	String pattern = "\\$(\\d*)(\\.\\d{2})";
	


	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(a);
	while (m.find()) {
		System.out.print(a.substring(m.start(), m.end()) + " ");
		}
	}
}

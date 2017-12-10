package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substring {
	
	public static void Deteerminate (String a, String b) {
		Pattern p = Pattern.compile(b);
		Matcher m = p.matcher(a);
		System.out.println(m.find());
		System.out.println(a.contains(b));
		
		
	}
	public static void initials (String a) {
		
		String[] words = a.split("\\s+");
		char j = words[1].charAt(0);
		//String[] n = words[1].split("\\s+");
		char m = words[2].charAt(0);
		
		System.out.println(words[0]+"." + j + "." + m);
		System.out.println(words[0]);
		System.out.println(words[0]+ " " + words[2] + " " + words[1]);
		
	}
	
	public static boolean validation (String userNameString) {
		Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
		Matcher m = p.matcher(userNameString);
		return m.matches();
	}
}

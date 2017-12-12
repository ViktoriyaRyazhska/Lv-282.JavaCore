package lw8_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		String[] s= {"Vacja Pupkin, 1985-31-12,4_8,Ff$"};
	
		for (String string : s) {
			
		if(checkWithRegExp(string)) {
			System.out.println("username '" + string + "' is validated!");
		}
		else {
			System.out.printf("false\n");
		}

	}
	}
	
	public static boolean checkWithRegExp(String userNameString){
		Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
		Matcher m = p.matcher(userNameString);
	     return m.matches();
	 }

}

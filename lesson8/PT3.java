package lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PT3 {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Li");
		names.add("bond007");
		names.add("veryVeryBigbigname");
		names.add("Andry-Piter");
		names.add("Li_arny");
		
		String pattern = "[a-zA-Z_0-9-]{3,15}";
		Pattern p = Pattern.compile(pattern);
		Matcher m;
		
		for (String name: names) {
			m = p.matcher(name);
			System.out.printf("%s:   ", name );
			if(m.matches()) {
				System.out.printf("true\n");
			} else {
				System.out.printf("false\n");
			}
		}
		
	}
}

//The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
//Using regular expressions implement checking the user name for validity. 
//Input five names in the main method . O
//utput a message to the console of the validation of each of the entered names.

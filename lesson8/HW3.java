package lesson8;

import java.util.regex.*;

public class HW3 {

	public static void main(String[] args) {

		String pattern = "\\$[0-9]+\\.[0-9]{2}";
		String text = "$ The symbol of dollar is $. It's meen that something can cost $10.0022 or $100.99 or $567.01";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + " ");
		}
		
		
	}

}

//Implement a pattern for US currency:
//	the first symbol "$", then any number of digits,
//	dot and two digits after the dot. 
//	Enter the text from the console that contains several occurrences of US currency. Display all occurrences on the screen.

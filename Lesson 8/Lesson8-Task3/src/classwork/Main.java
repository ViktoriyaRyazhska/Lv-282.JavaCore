/*
 * The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. 
 * Using regular expressions implement checking the user name for validity. 
 * Input five names in the main method . 
 * Output a message to the console of the validation of each of the entered names.
 *
 */

package classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String[] userNames = { "jgw_c72dbks", "p2", "jn jhd", "wwwwqwd", "bx)ncxj", "hdwhugbshdhsgfjsbgjssdf", "_hdb__cj111" };

		for (String string : userNames) {
			if (validate(string)) {
				System.out.println("username '" + string + "' is validated!");
			}
		}

	}

	public static boolean validate(String string) {
		// The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
		
		Pattern p = Pattern.compile("[a-z_0-9]{3,15}");
		Matcher m = p.matcher(string);
		return m.matches();
	}

}

package eu.mdpop.engine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	private Pattern p;
	private Matcher m;

	private String regex;
	private String text;

	/**
	 * Method to validate Project. Number We should have 5 number first two - 16 or
	 * 17 or 18.
	 * 
	 * @return validated Project Number (int).
	 */
	public int validateProjectNumber() {

		regex = "(16|17|18)+([0-9]){3}";
		p = Pattern.compile(regex);
		int projectNumber;

		while (true) {
			System.out.print("Input project Number: ");
			projectNumber = IOClass.readIntValue();
			if (projectNumber != 0) {

				text = Integer.toString(projectNumber);
				m = p.matcher(text);

				if (m.matches()) {
					return projectNumber;
				} else {
					System.out.println("Project Number is not correct! Try again");
					continue;
				}
			}
		}
	}

	/**
	 * Method to validate Project Name. We should have first capital letter.
	 * 
	 * @return validated Project Name (String).
	 */
	public String validateProjectName() {
		regex = "[A-Z]+\\w+(\\s\\w)*";
		p = Pattern.compile(regex);

		String projectName;

		while (true) {
			System.out.print("Input project Name: ");
			projectName = IOClass.readStringValue();
			if (!projectName.equals("")) {
				text = projectName;
				m = p.matcher(text);

				if (m.matches()) {
					return projectName;
				} else {
					System.out.println("Project Name is not correct! Try again");
					continue;
				}
			}
		}
	}

	/**
	 * Method to validate Quantity of Subprojects. We should have at least 1 subproject, but no more as 30.
	 * 
	 * @return validated Project Name (String).
	 */
	public int validateQuantity() {
		int quantity;
		while (true) {
			System.out.print("Input quantity of Subprojects: ");
			quantity = IOClass.readIntValue();
			if ((quantity > 0) & (quantity < 30)) {
				return quantity;
			} else {
				System.out.println("Quantity of Subprojects is not correct! Try again");
				continue;
			}
		}
	}

}

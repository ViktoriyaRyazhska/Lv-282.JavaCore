package eu.mdpop.engine;

import java.util.Map;
import java.util.TreeMap;

import eu.mdpop.projects.*;

public abstract class Engine {

	private static Validator validator = new Validator();

	private static Map<Integer, Project> map = new TreeMap<Integer, Project>();

	public static void addProject(Project project) {
		map.put(project.getProjectNumber(), project);
	}

	public static void printAllProjects() {
		System.out.println(map.toString());
	}

	public static Project addProjectFromConsole() {
		Project project = new Project();

		setValidProjectNumber(project);
		setValidProjectName(project);
		setValidQuantityOfSubprojects(project);

		project.getOrder();

		project.addSubprojects();
		System.out.println(project);
		return project;
	}

	public static void produceProject(Project project) {
		System.out.println();
		System.out.println("We have " + project.getProjectNumber() + " " + project.getProjectName() + " to produce");
		project.produce(project.getListOfSubprojects());
	}

	/**
	 * Check, if inputed text is valid as value of Project Number.
	 * 
	 * @param project
	 *            - editable Project.
	 */
	private static void setValidProjectNumber(Project project) {
		int validProjectNumber = validator.validateProjectNumber();
		project.setProjectNumber(validProjectNumber);

		String data = "Project Number: " + validProjectNumber;
		write(project, data);
	}

	/**
	 * Check, if inputed text is valid as value of Project Name.
	 * 
	 * @param project
	 *            - editable Project.
	 */
	private static void setValidProjectName(Project project) {
		String validProjectName = validator.validateProjectName();
		project.setProjectName(validProjectName);

		String data = "Project Name: " + validProjectName;
		try {
			write(project, data);
		} catch (FileNotEmptyException e) {
			System.out.println("File is not Empty!!!");
			write(project, data);
		}
	}

	/**
	 * Check, if inputed text is valid as value of Quantity of Subprojects.
	 * 
	 * @param project
	 *            - editable Project.
	 */
	private static void setValidQuantityOfSubprojects(Project project) {
		int validQuantity = validator.validateQuantity();
		project.setQuantityOfSubprojects(validQuantity);

		String data = "Quantity Of Subprojects: " + validQuantity;
		write(project, data);
	}

	private static void write(Project project, String data) throws FileNotEmptyException {
		IOClass.writeToFile(data, project.getProjectNumber());
	}

}

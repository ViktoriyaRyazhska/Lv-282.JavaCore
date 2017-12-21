package eu.mdpop.projects;

import java.util.ArrayList;
import java.util.List;

import eu.mdpop.engine.*;
import eu.mdpop.production.*;

/**
 * Class Project
 * 
 * @author VR
 * @version 1.0
 * @since 19.12.2017
 *
 * 
 */

public class Project implements Production {

	private int projectNumber;
	private String projectName;
	private int quantityOfSubprojects;

	private Client client = null;

	public List<Subproject> listOfSubprojects = new ArrayList<Subproject>();

	public Project() {

	}

	/**
	 * Constructor to create objects of class Project. At once we create list of
	 * Subprojects, what we have in this Project.
	 * 
	 * @param projectNumber
	 *            unique number for this Project
	 * @param projectName
	 *            name of Project
	 * @param quantityOfSubprojects
	 *            quantity of different Subprojects in this Project. Min value = 1.
	 */
	public Project(int projectNumber, String projectName, int quantityOfSubprojects) {
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.quantityOfSubprojects = quantityOfSubprojects;

		for (int i = 0; i < this.quantityOfSubprojects; i++) {
			listOfSubprojects.add(new Subproject());
		}
	}

	public int getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getQuantityOfSubProjects() {
		return quantityOfSubprojects;
	}

	public void setQuantityOfSubprojects(int quantityOfSubProjects) {
		this.quantityOfSubprojects = quantityOfSubProjects;
		for (int i = 0; i < this.quantityOfSubprojects; i++) {
			listOfSubprojects.add(new Subproject());
		}
	}

	public String getClient() {
		return client.getNameOfClient();
	}

	public void setClient(String nameOfClient) {
		this.client.setNameOfClient(nameOfClient);
	}

	public void getOrder() {
		System.out.println("We received order for project " + getProjectNumber() + " " + getProjectName());

	}

	public List<Subproject> getListOfSubprojects() {
		return listOfSubprojects;
	}

	public void setListOfSubprojects(List<Subproject> listOfSubprojects) {
		this.listOfSubprojects = listOfSubprojects;
	}

	public void addSubprojects() {
		for (Subproject subproject : listOfSubprojects) {
			int index = listOfSubprojects.indexOf(subproject);
			System.out.println("Subproject " + (index + 1));

			addQuantityToSubproject(listOfSubprojects.indexOf(subproject));
			addNameToSubproject(index);

		}
	}

	private void addQuantityToSubproject(int index) {
		System.out.print("Input quantity:");
		int quantity = IOClass.readIntValue();
		listOfSubprojects.get(index).setQuantity(quantity);
	}

	private void addNameToSubproject(int index) {
		System.out.print("Input name:");
		String subprojectName = IOClass.readStringValue();
		listOfSubprojects.get(index).setSubprojectName(subprojectName);
	}

	@Override
	public String toString() {
		return "Project " + projectNumber + " " + projectName + " " + listOfSubprojects;
	}

}

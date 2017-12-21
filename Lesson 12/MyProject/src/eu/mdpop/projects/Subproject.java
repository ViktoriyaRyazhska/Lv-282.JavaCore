package eu.mdpop.projects;

import eu.mdpop.engine.*;

public class Subproject extends Project {

	private String subprojectName;
	private int quantity;
	private int projectNumber;
	private String projectName;

	public Subproject() {
		this.projectNumber = super.getProjectNumber();
		this.projectName = super.getProjectName();
	}

	public String getSubprojectName() {
		return subprojectName;
	}

	public void setSubprojectName(String subprojectName) {
		this.subprojectName = subprojectName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProjectNumber() {
		return projectNumber;
	}

	public String getProjectName() {
		return projectName;
	}

	@Override
	public String toString() {
		return subprojectName + " x " + quantity;
	}

}

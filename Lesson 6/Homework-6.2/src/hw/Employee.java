package hw;

import java.text.DecimalFormat;

public abstract class Employee implements CalculatePay {

	DecimalFormat df = new DecimalFormat("0.00");

	private String employeeld;
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", ";
	}

}

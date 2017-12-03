package lesson6.empl;

public abstract class Employee implements IPay{	

	private String name;
	private String employeeld;
	private String nameOfCompany;
	
	public Employee(String name, String employeeld, String nameOfCompany) {
		this.name = name;
		this.employeeld = employeeld;
		this.nameOfCompany = nameOfCompany;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public String getName() {
		return name;
	}

	public String getNameOfCompany() {
		return nameOfCompany;
	}

	
	
}

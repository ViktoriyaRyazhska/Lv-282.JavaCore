package java_4;

public class Employee {
	
	private String name;
	private int departmentNumber;
	private int salary;
	
	public Employee(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	
	private String getName() {
		return name;
	}

	private int getDepartmentNumber() {
		return departmentNumber;
	}

	private int getSalary() {
		return salary;
	}

	public static void showDeparmentEmployee(Employee[] employees, int depNumber) {
		if (!isDepartment(employees, depNumber)){
			System.out.println("The department " + depNumber + " don't exist\n");
			return;
		}
		System.out.println("In department number " + depNumber + " work next employees:");		
		for (Employee employee: employees) {
			if (employee.getDepartmentNumber() == depNumber) {
				System.out.println(employee.getName() + " has salary: " + employee.getSalary());
			} 
		}
		System.out.println();
		
	}
	
	private static boolean isDepartment(Employee[] employees, int depNumber) {
		for (Employee employee: employees) {
			if (employee.getDepartmentNumber() == depNumber) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public String toString() {
		return "Employee [ " + name + ", departmentNumber = " + departmentNumber + ", salary = " + salary + "]";
	}
	
	public static void printEmployee(Employee[] employees){
		for (Employee emp: employees) {
			System.out.println(emp);
		}
		System.out.println();
	}
	
	public static void arrangeBySalary(Employee[] employees) {
		Employee temp;
		
		System.out.println("Workers by salary in descending order:");
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if ( employees[i].getSalary() < employees[j].getSalary() ) {
					temp = employees[i];
					employees[i] = employees[j];
					employees[j] = temp;
				}
			}
		}
		
		printEmployee(employees);
	}
	
	
	
	
}

//Create a class Employee with fields name, department number, salary.
//Create five objects of class Employee. 
//Display all employees of a certain department (enter department number in the console);
//arrange workers by the field salary in descending order.






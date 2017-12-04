
public abstract class Employee implements PayInterface {

	private String empId;
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Employee(String empId) {
		this.empId = empId;
	}
	
	public static void sortBySalaryD(Employee[] emp) {
		Employee tmp;
		
		for (int i = 0; i < emp.length-1; i++) {
			for (int j = i+1; j < emp.length; j++) {
				if(emp[i].calculatePay() < emp[j].calculatePay()) {
					tmp = emp[i];
					emp[i] = emp[j];
					emp[j] = tmp;
				}
			}
		}
	}
	
	public static void displayEmployee(Employee[] emp) {
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].toString());
		}
	}
}

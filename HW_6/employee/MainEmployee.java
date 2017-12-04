
public class MainEmployee {

	public static void main(String[] args) {

		Employee[] emp = new Employee[3];

		emp[0] = new SalariedEmployee("12549", 1000, "13468");
		emp[1] = new ContractEmployee("11142", 24, 17, "18462");
		emp[2] = new SalariedEmployee("12550", 1200, "49218");
		
		Employee.sortBySalaryD(emp);
		System.out.println("Sorted list in descending order (by salary):");
		Employee.displayEmployee(emp);
	}



	
}

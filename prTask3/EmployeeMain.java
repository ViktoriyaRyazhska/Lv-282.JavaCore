package prTask3;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Anri", 2, 12);
		Employee employee2 = new Employee("Bob", 4, 8);
		Employee employee3 = new Employee("Candy", 9, 5);
		System.out.println("Total salary is: " + Employee.showTotalSalary());
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		System.out.println("Total salary is: " + Employee.showTotalSalary());
		
		employee1.changeRate(3);
		System.out.println("Total salary is: " + Employee.showTotalSalary());
		
		employee2.bonuses();
		System.out.println("Total salary is: " + Employee.showTotalSalary());
		
	}

}

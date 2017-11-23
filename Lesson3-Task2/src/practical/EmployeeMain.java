package practical;

public class EmployeeMain {

	public static void main(String[] args) {


		Employee e1 = new Employee();
		e1.setName("Roman");
		e1.setRate(10);
		e1.setHours(10);

		Employee e2 = new Employee("Kolya", 3);
		e2.setHours(10);
		
		e2.changeRate(10);
		e2.bonuses();
		
		Employee e3 = new Employee("Oleg", 33, 1);
		
		e3.setHours(10);
		e3.changeRate(10);
		
		e3.bonuses();
		e3.bonuses();
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		System.out.println("Total value of all salaries + bonuses = " + Employee.totalSum);
		
	}

}

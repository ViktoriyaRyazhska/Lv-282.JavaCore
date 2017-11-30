package classWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {


		Employee e1 = new Employee("Taras", 1, 5000);
		Employee e2 = new Employee("Igor", 1, 8000);
		Employee e3 = new Employee("Oleg", 2, 15000);
		Employee e4 = new Employee("Ira", 2, 10000);
		Employee e5 = new Employee("Olena", 1, 20000);
		
		Employee[] employees = {e1, e2, e3, e4, e5};
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//checking Departement
		
		System.out.println("Input departement:");
		
		int inputDep = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (Employee employee : employees) {
			if (employee.getDep() == inputDep) {
				System.out.println(employee);
				} else {
					count++;
				}
		}
		
		if (count == employees.length) {
			System.out.println("There are no employees in departement " + inputDep);			
		}
		
		
		//arranging of workers by salary
		System.out.println();
		System.out.println("Sorted array of workers:");
		
		Employee e;

		for (int i = 0; i < employees.length; i++) {
			for (int j = i+1; j<employees.length; j++) {
				if (employees[i].getSalary() < employees[j].getSalary()) {
					e = employees[i];
					employees[i] = employees[j];
					employees[j] = e;
				}
			}
		}
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}

}

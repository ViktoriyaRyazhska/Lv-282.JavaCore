package hw;

public class Main {

	public static void main(String[] args) {

		Employee[] employees = { 
				new SalariedEmployee(11753, "Andriy"), 
				new ContractEmployee(11350, "Oksana"),
				new ContractEmployee(11436, "Galina"), 
				new ContractEmployee(11861, "Igor"),
				new SalariedEmployee(11532, "Taras"), 
				new ContractEmployee(11090, "Petro"),
				new SalariedEmployee(11511, "Diana"), 
				new SalariedEmployee(11714, "Taras"),
				new ContractEmployee(11722, "Ira")
				};

		System.out.println("Unsorted array:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();

		// arranging by wage in descending order
		Employee e;

		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].calculatePay() < employees[j].calculatePay()) {
					e = employees[i];
					employees[i] = employees[j];
					employees[j] = e;
				}
			}
		}

		System.out.println("Sorted array:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}

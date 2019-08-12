package lesson3;

public class MainEmployee {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setName("Oleg");
		employee1.setRate(4);
		employee1.setHours(4);

		Employee employee2 = new Employee("Anna", 5);
		employee2.setHours(5);

		Employee employee3 = new Employee("Mary", 6, 6);

		System.out.print("Employee\t" + "Rate\t" + "Hour\t" + "Sum\t" + "Bonuses\t" + "Total sum\n");
		System.out.print("1." + employee1);
		System.out.print("2." + employee2);
		System.out.print("3." + employee3);

	}
}

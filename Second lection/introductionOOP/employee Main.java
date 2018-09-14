
public class IntroductionOOP {

	public static void main(String[] args) {
		Employee e1 = new Employee("Vika", 52, 23);
		Employee e2 = new Employee("Vovk", 45, 83);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		System.out.println("Total salary is: " + Employee.showTotalSalary());
		
		e1.changeRate(3);
		System.out.println("Total salary is: " + Employee.showTotalSalary());
		
		e2.changeRate(3);
		System.out.println("Total salary is: " + Employee.showTotalSalary());
		
		e2.bonus();
		System.out.println("Total salary is: " + Employee.showTotalSalary());
		
		e1.bonus();
		System.out.println("Total salary is: " + Employee.showTotalSalary());
		
		e1.sallery();
		e2.sallery();
	}

}

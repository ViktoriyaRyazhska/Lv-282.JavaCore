import java.io.IOException;

public class PracticalTask {

	public static void main(String[] args) throws IOException {
/*Practical task*/
		Employee em1 = new Employee("Vova",5,48);	
		Employee em2 = new Employee("Taras",12,30);
		Employee em3 = new Employee("Olga",10,45);
		
		System.out.println("Add to " + em2.getName() + " salary " + em2.bonuses(30) + "$");
		System.out.println(em1);
		System.out.println("Total salary: " + Employee.totalSalary() + "$");
		System.out.println("_________________________________");
/*Homework*/	
	Person pr1 = new Person("Taras",1992);
	Person pr2 = new Person("Vova",1997);
	Person pr3 = new Person("Roman",1972);
	Person pr4 = new Person("Olena",2002);
	Person pr5 = new Person();
	pr5.input();
	
	pr2.changeName("Natalya");
	
	pr2.output();
	
	System.out.println(pr4.getName() + " has " + pr4.PersonAge() + " year");
	} 
}
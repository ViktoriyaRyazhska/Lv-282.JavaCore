package lesson6.empl;

import java.util.ArrayList;

public class MainSalary {

	public static void main(String[] args) {
		
		ArrayList<Employee> myEmployee = new ArrayList<Employee>(); 
		
		myEmployee.add(new ContractEmployee("Andryy", "000001", "Arktika", "3011458693", 243.13, 45));
		myEmployee.add(new SalariedEmployee("Brian", "000002", "Bonjour", "2345981293", 7000));
		myEmployee.add(new ContractEmployee("Carmen", "000003", "Condor", "4987522156", 173.13, 35));
		myEmployee.add(new SalariedEmployee("Dilan", "000004", "Danfoss", "2348897521", 14000));
		myEmployee.add(new ContractEmployee("Endy", "000005", "Ergo",     "9530245796", 350.13, 50));
//		myEmployee.add(new SalariedEmployee("Freddy", "000006", "Fakro",  "4597871230", 9000));
//		myEmployee.add(new SalariedEmployee("Georg", "000007", "Grand",  "9831456785", 3500));
		
		
		System.out.println("General list");
		printAll(myEmployee);
		System.out.println("Sorted list");
		printBySalary(myEmployee);
		System.out.println("Genaral list");
		printAll(myEmployee);
		
		
		
	}

	private static void printAll(ArrayList<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	private static void printBySalary(ArrayList<Employee> list) {
		printAll(sortBySalary(list));
	}
	
	private static ArrayList<Employee> sortBySalary(ArrayList<Employee> list){
		Employee[] arrayEmployee = new Employee[list.size()];
		Employee temp;
		ArrayList<Employee> returnList = new ArrayList<Employee>();
		
		arrayEmployee = list.toArray(arrayEmployee); 
		
		for (int  i= 0; i < arrayEmployee.length - 1; i++) {
			for (int j = i + 1; j < arrayEmployee.length; j++) {
				if (((arrayEmployee[i]).calculatePay()) < ((arrayEmployee[j]).calculatePay())){
					temp = arrayEmployee[i];
					arrayEmployee[i] = arrayEmployee[j];
					arrayEmployee[j] = temp;
				}
			}
		}  
		
		for (int i = 0; i < arrayEmployee.length; i++) {
			returnList.add(arrayEmployee[i]);
		}
		
		return returnList;
	}
	
}


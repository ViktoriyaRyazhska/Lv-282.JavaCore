package hw6_2;

public class main {

	public static void main(String[] args) {
		 Employee []emp1 =new Employee[8];
		    emp1[0] =new SalariedEmployee("vova", "olejna", 15, 190);
		    emp1[1] =new SalariedEmployee("vika", "olejna", 16, 190);
            emp1[2] =new  ContractEmployee("vova",0021,10000);
		    emp1[3] =  new SalariedEmployee("vova", "chell", 20, 180);
			emp1[4] = new SalariedEmployee("vova", "wog", 25, 190);
			emp1[5] = new  ContractEmployee("vova", 0022, 5000);
			emp1[6] = new SalariedEmployee("vova", "arsen", 10, 200);
			emp1[7] =new  ContractEmployee("vova", 0032, 15000);
		
		for (Employee employee : emp1) {
			System.out.println(employee.calculatePay());
		}
		
		for (int i = 0; i < emp1.length; i++) {
			for (int j = i+1; j < emp1.length; j++) {
				if(emp1[i].calculatePay()< emp1[j].calculatePay()) {
					Employee e= emp1[i];
					emp1[i] = emp1[j];
					emp1[j] = e;
				}
				
			
				
			}
			System.out.println();
					
			
		}
		for (Employee employee : emp1) {
			System.out.println(employee );
		}
		}
		
		
		

	}





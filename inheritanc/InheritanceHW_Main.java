package inheritanc;

/*Create an interface to the method calculatePay(), the base class Employee with a string variable employeeld. 
Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class. 
Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child). 
Describe the string variable socialSecurityNumber in the class SalariedEmployee .
Include a description of federalTaxIdmember in the class of contractEmployee .
The calculation formula for the "time-worker“ is: "the average monthly salary = hourly rate * number of hours worked"
*/

public class InheritanceHW_Main {
	

	
	
		public static void main(String[] args) {
			
			
			Employee worker = new Employee();
			
			Employee workers[] = new Employee[4];
			workers[0] = new SalariedEmployee();
			workers[0].fixedMonthlyPay = 12300;
			workers[0].employeeld = "w1";
			workers[1] = new SalariedEmployee();
			workers[1].fixedMonthlyPay = 4211;
			workers[1].employeeld = "w2";
			workers[2] = new ContractEmployee();
			workers[2].hourlyRate = 45;
			workers[2].numbOfHoursWork = 200;
			workers[2].employeeld = "w3";
			workers[3] = new ContractEmployee();
			workers[3].hourlyRate = 5;
			workers[3].numbOfHoursWork = 203;
			workers[3].employeeld = "w4";
			
			for (int i=0; i<workers.length; i++){
				workers[i].calculatePay();			
			}
			
			for (int j=0; j<workers.length-1; j++)	{
				for (int i=0; i<workers.length-1; i++) {
				
				if (workers[i].averMonthlySalary >= workers[i+1].averMonthlySalary) {
				
					worker = workers[i];
					workers[i]=workers[i+1];
					workers[i+1]=worker;
				}
					}
				}
			
			
			for (int i=0; i<workers.length; i++){
				
				System.out.println(workers[i].employeeld + " " + workers[i].averMonthlySalary);
			
			}
		}

	}


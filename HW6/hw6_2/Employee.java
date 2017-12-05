package hw6_2;

public abstract class Employee implements calculatePay{
 private String employeeld;


public Employee(String employeeld) {	
	this.employeeld = employeeld;
}



public String getEmployeeld() {
	return employeeld;
}



public void setEmployeeld(String employeeld) {
	this.employeeld = employeeld;
}



@Override
public String toString() {
	return "Employee [employeeld=" + employeeld + "]";
}









 
 
}

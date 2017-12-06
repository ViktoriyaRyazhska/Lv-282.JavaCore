package com.company;
import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private int department;
    private int salary;

    static Scanner sc = new Scanner(System.in);

    public Employee(String firstName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }



    public int getDepartment() {
        return this.department;
    }


    public int getSalary() {
        return salary;
    }

    public static void getSortWorkersByDepartment(Employee[] employees){
        System.out.println("Please enter employee department:");
        int newDepartment = sc.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if (newDepartment == employees[i].getDepartment()) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void getArrangeWorkersBySalary(Employee[] employees){
        System.out.println("Workers by the field salary:\n");

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {

                if (employees[i].getSalary() < employees[j].getSalary()) {
                    Employee tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;

                }
            }
        }
            for (int i = 0; i < employees.length; i++){
                System.out.println(employees[i]);
            }
        }


    @Override
    public String toString() {
        return firstName + " " + lastName + " - dep: " + department;
    }
}

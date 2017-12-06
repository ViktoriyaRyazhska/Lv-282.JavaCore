package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Oleh");
        employee1.setRate(54);
        employee1.setHours(8);

        Employee employee2 = new Employee("Marta", 47);
        employee2.setHours(8);

        Employee employee3 = new Employee("Igor", 23, 8);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println();
        System.out.println("Total salary of all workers: " + Employee.getToSum() + " UAH");

    }
}

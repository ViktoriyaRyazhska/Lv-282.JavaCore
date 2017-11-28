package com.company;

public class Employee {

    private String firstName;
    private String lastName;
    private int department;
    private int salary;

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

    @Override
    public String toString() {
        return firstName + " " + lastName + " - dep: " + department;
    }
}

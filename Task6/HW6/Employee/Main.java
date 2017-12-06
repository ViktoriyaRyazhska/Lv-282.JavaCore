package com.company;

public class Main {

    public static void main(String[] args) {

        Employee[] emp = new Employee[5];
        emp[0] = new SalariedEmployee("Ivan Rok", 34435, 2000);
        emp[1] = new ContractEmployee("Vasyl Bod", "db122c", 14, 160);
        emp[2] = new SalariedEmployee("Larysa Bin", 83859, 3500);
        emp[3] = new ContractEmployee("Vira Dip", "fr322c", 17, 160);
        emp[4] = new SalariedEmployee("Igor Don", 88959, 5000);


        Employee.getSortByPayment(emp);


    }
}

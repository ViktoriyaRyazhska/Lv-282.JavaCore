package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int [] arr = {1, 4, 5, -7, -3, 0, 10, -9, 2, -1};
        int sum = 0;
        int max = arr[0];
        int countNeg = 0;
        int countPos = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] >= 0){
                countPos++;
                sum += arr[i];
            }
            if (arr[i] < 0){
                countNeg++;
            }


        }

        if (countPos == countNeg){
            System.out.println("The same number of values");
        }
        if (countPos > countNeg){
            System.out.println("The positive values more");
        } else {
            System.out.println("The negative values more");
        }
        System.out.println("Maximum = " + max);
        System.out.println("Sum positive numbers = " + sum);
        System.out.println(countNeg + " - negative numbers");


        Employee employee1 = new Employee("Rinat", "Ahmetov", 323, 12000);
        Employee employee2 = new Employee("Petro", "Poroshenko", 333, 12000);
        Employee employee3 = new Employee("Victor", "Pinchuk", 313, 17000);
        Employee employee4 = new Employee("Igor", "Kolomoiyskiy", 323, 13000);
        Employee employee5 = new Employee("Ben", "Taruta", 123, 24000);

        Employee [] employees = {employee1, employee2, employee3, employee4, employee5};


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter employee department:");

        int newDepartment = sc.nextInt();


        for (int i = 0; i < employees.length; i++) {
            if (newDepartment == employees[i].getDepartment()) {
                System.out.println(employees[i]);
            }
        }

        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++){

                if (employees[i].getSalary() < employees[j].getSalary()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;

                }
            }
        }
        System.out.println();
        System.out.println("Workers by the field salary");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(employees[i]);
        }

    }

}

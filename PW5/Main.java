package com.company;

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
            if (arr[i] > 0){
                countPos++;
                sum += arr[i];
            }
            if (arr[i] < 0){
                countNeg++;
            }
        }

        if (countPos > countNeg){
            System.out.println("The positive values more");
        } else {
            System.out.println("The negative values more");
        }
        System.out.println("Maximum = " + max);
        System.out.println("Sum positive numbers = " + sum);
        System.out.println(countNeg + " - negative numbers");

        Employee [] employees =  new Employee[5];
        employees[0] = new Employee("Rinat", "Ahmetov", 323, 12000);
        employees[1] = new Employee("Petro", "Poroshenko", 333, 12000);
        employees[2] = new Employee("Victor", "Pinchuk", 313, 17000);
        employees[3] = new Employee("Igor", "Kolomoiyskiy", 323, 13000);
        employees[4] = new Employee("Ben", "Taruta", 123, 24000);



        Employee.getSortWorkersByDepartment(employees);
        System.out.println();
        Employee.getArrangeWorkersBySalary(employees);
    }

}

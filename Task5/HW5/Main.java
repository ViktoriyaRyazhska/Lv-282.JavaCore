package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);

        System.out.println("Task1____________________");
        System.out.print("Please enter the number of the month: ");
        int m = Integer.parseInt(sc.nextLine());
        if (0 < m && m <= 12) {
            for (int i = 0; i < month_days.length; i++) {
                if ((m - 1) == i) {
                    System.out.println("In " + m + " is " + month_days[i] + " days");
                }
            }
        } else {
            System.out.println("Year hes 12 months, You enter the number " + m);
        }


        System.out.println("Task2____________________");
        int [] arr1 = {1, 4, 5, -7, -9, 1, 2, 2, 1, 7};
        int sum = 0;
        int prod = 1;

        for (int i = 0; i < arr1.length - 5 ; i++) {
            sum += arr1[i];
        }
        if (sum > 0){
            System.out.println("Sum is positive = " + sum);
        } else {
            for (int i = 5; i < arr1.length; i++){
                prod *= arr1[i];

            }
            System.out.println("Product = " + prod);
        }

        System.out.println("Task3____________________");
        int [] arr2 = {1, 4, 2, -7, -9};
        int iMin  = 0;
        int min = arr2[0];
        int n = 0;
        for (int i = 0; i < arr2.length; i++){

            if (arr2[i] < min){
                min = arr2[i];
                iMin = i;
            }

        }
        System.out.println( "Min = " + min + ", position " + iMin);


        System.out.println("Task4____________________");
        int prod1 = 1;
        for (int i = 0; i < 100; i++) {
            System.out.println("Input number");
            n = Integer.parseInt(sc.nextLine());
            if (n <= 0){
                break;
            }
            if (n%2 == 0) {
                prod1 *= n;
            }
        }
        System.out.println("Product of all entered even numbers = " + prod1);

        System.out.println("Task5____________________");

        Car [] cars  = new Car[4];
        cars[0] = new Car("VW Touareg", 2017,2.0 );
        cars[1] = new Car("BMW X5", 2014,3.0 );
        cars[2] = new Car("Audi Q7", 2016,4.5 );
        cars[3] = new Car("Skoda Kodiaq", 2017,2.0 );


        Car.getSortCarsByYear(cars);
        System.out.println();
        Car.getArrangeCarByYears(cars);
    }
}


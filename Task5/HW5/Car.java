package com.company;

import java.util.Scanner;

public class Car {


    String type;
    int year;
    double engine;

    public Car(String type, int year, double engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }

    public int getYear() {
        return  year;
    }


    public static void getSortCarsByYear(Car [] cars){
        System.out.print("Please enter year:");
        int newYear = sc.nextInt();
        for (int i = 0; i < cars.length; i++) {
            if (newYear == cars[i].getYear()) {
                System.out.println(cars[i]);
            }
        }

    }

    static Scanner sc = new Scanner(System.in);
    public static void getArrangeCarByYears(Car [] cars) {
        System.out.println("Cars ordered by the field year:\n");
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {

                if (cars[i].getYear() < cars[j].getYear()) {
                    Car tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }

    @Override
    public String toString() {
        return "Car {" + type + ", year of production = " + year + ", engine = " + engine + '}';
    }
}





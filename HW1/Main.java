package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Please enter a radius");
        double r = Double.parseDouble(br.readLine());
        double s = 3.1415*(r*r);
        double p = 2*3.1415*r;


        System.out.println("Perimeter your flower bad is " + p);
        System.out.println("Area your flower bad is " + s + "\n");

        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you from, " + name);
        String address = br.readLine();

        System.out.printf("Congratulation, %s you from in %s \n", name, address);

        double c1 = 3.49;
        double c2 = 5.69;
        double c3 = 3.59;

        System.out.println("How long time and what country did you call");
        System.out.print("USA = ");
        double t1 = Double.parseDouble(br.readLine());
        System.out.print("Brazil = ");
        double t2 = Double.parseDouble(br.readLine());
        System.out.print("China = ");
        double t3 = Double.parseDouble(br.readLine());

        System.out.println("\n");

        double p1 = c1 * t1;
        double p2 = c2 * t2;
        double p3 = c3 * t3;

        double sum = p1 + p2 + p3;

        if (t1 == 0 && t2 == 0 && t3 == 0) {
            System.out.println("You did not call any country");
        } else if (t1 == 0 && t2 == 0) {
            System.out.println("did not call to USA" + "did not call to Brazil" + "₴, China = " + p3);
        } else if (t1 == 0 && t3 == 0) {
            System.out.println("did not call to USA" + ", Brazil = " + p2 + "₴, did not call to China ");
        } else if (t2 == 0 && t3 == 0) {
            System.out.println("USA = " + p1 + "₴, did not call to Brazil" + "did not call to China ");
        } else if (t1 == 0) {
            System.out.println("Brazil = " + p2 + "₴, China = " + p3 + "₴, did not call to USA");
        } else if (t2 == 0) {
            System.out.println("USA = " + p1 + "₴, China = " + p3 + "₴, did not call to Brazil");
        } else if (t3 == 0) {
            System.out.println("USA = " + p1 + "₴, Brazil = " + p2 + "₴, did not call to China ");
        } else {
            System.out.println("USA = " + p1 + "₴, Brazil = " + p2 + "₴, China = " + p3);
        }


        if (sum > 0) {
            System.out.println("Today you spent " + sum + "₴, on phone calls");
        } else {
            System.out.println("Today you have not spend many on phone calls");
        }


    }
}

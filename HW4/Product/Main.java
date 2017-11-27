package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {

    public enum Continent {
        AFRICA, ASIA, EUROPA, NORTHAMERIKA, SOUTHAMERIKA, AUSTRALIA, ANTARCTICA
    }


    public static void main(String[] args) throws IOException {


       System.out.println("__________Task 1__________");
        int a = 7, b = 6, c = 9;

        if  (a%2!=0) {
            System.out.println(a + " is odd");
        } if (b%2!=0) {
            System.out.println(b + " is odd");
        } if (c%2!=0){
            System.out.println(c + " is odd");
        }

        System.out.println("__________Task 2__________");

        int day = 2;

        switch (day){
            case 1:
                System.out.println("Понеділок, Monday, Lundi");
                break;
            case 2:
                System.out.println("Вівторок, Tuesday, Mardi");
                break;
            case 3:
                System.out.println("Середа, Wednesday, Mercredi");
                break;
            case 4:
                System.out.println("Четвер, Thursday, Jeudi");
                break;
            case 5:
                System.out.println("Пятниця, Friday, Vendredi");
                break;
            case 6:
                System.out.println("Субота, Saturday, Samedi");
                break;
            case 7:
                System.out.println("Неділя, Sunday, Dimanche");
                break;
        }

        System.out.println("__________Task 3__________");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter name country - ");
        String country = br.readLine();

        Continent continent = null;

        switch (country.toLowerCase()) {
            case "ukraine":
                continent = continent.EUROPA;
                break;
            case "china":
                continent = continent.ASIA;
                break;
            case "egypt":
                continent = continent.AFRICA;
                break;
            case "usa":
                continent = continent.SOUTHAMERIKA;
                break;
            default:
                System.out.println("No this country");
                System.exit(0);
        }
        System.out.println(continent);

        System.out.println("__________Task 4__________");

        Product product1 = new Product("milk", 24, 500);
        Product product2 = new Product("oil", 34, 400);
        Product product3 = new Product("beer", 28, 300);
        Product product4 = new Product("cheese", 27, 100);

        double mostPrice = product1.getPrice();
        double maxQuantity = product1.getQuantity();
        Product productExp = product1;
        Product productQty = product1;

        if(mostPrice <= product2.getPrice()) {
            mostPrice = product2.getPrice();
            productExp = product2;
        }

        if(mostPrice <= product3.getPrice()) {
            mostPrice = product3.getPrice();
            productExp = product3;
        }

        if(mostPrice <= product4.getPrice()) {
            mostPrice = product4.getPrice();
            productExp = product4;
        }

        if(maxQuantity <= product2.getQuantity()) {
            maxQuantity = product2.getQuantity();
            productQty = product2;
        }

        if(maxQuantity <= product3.getQuantity()) {
            maxQuantity = product3.getQuantity();
            productQty = product3;
        }

        if(maxQuantity <= product4.getQuantity()) {
            maxQuantity = product4.getQuantity();
            productQty = product4;
        }

        System.out.println(productExp.getName() + "is the most expensive, quantity is "
                + productQty.getQuantity() + " units");
        System.out.println(productQty.getName() + " has the biggest quantity ="
                + productQty.getQuantity() + " units");

    }
}

package com.company;

public class Main {


    public static void main(String[] args) {

        System.out.println("_____Task1_____");

        TestTrue testTrue1 = new TestTrue(3.45f);
        testTrue1.test();
        TestTrue testTrue2 = new TestTrue(3.4522f);
        testTrue2.test();
        TestTrue testTrue3 = new TestTrue(63.45243f);
        testTrue3.test();

        System.out.println("_____Task2_____");
        MaxMin mm = new MaxMin(37,65,767);
        mm.getResult();

        System.out.println("_____Task3_____");
        HTTPError httpError = new HTTPError(407);
        httpError.getStatusCode();

        System.out.println("_____Task4_____");

        Dog dog1 = new Dog("Fil", 1, Dog.Breed.CHIHUAHUA);
        Dog dog2 = new Dog("Fil", 18, Dog.Breed.MALAMUTE);
        Dog dog3 = new Dog("Barbara", 19, Dog.Breed.DACHSHUND);

        int maxAge = dog1.age;
        Dog oldDog = dog1;


        if (dog1.name == dog2.name && dog1.name == dog3.name && dog2.name == dog3.name){
            System.out.println("Attention, you have entered three identical names - " + dog1.name);

        }
        if (dog1.name == dog2.name || dog1.name == dog3.name){
            System.out.println("Attention, you have entered two identical names - " + dog1.name);

        }
        if (dog2.name == dog3.name){
            System.out.println("Attention, you have entered two identical names - " + dog2.name);

        }
        if (maxAge <= dog2.age){
            maxAge = dog2.age;
            oldDog = dog2;
        }
        if (maxAge <= dog3.age){
            maxAge = dog3.age;
            oldDog = dog3;
        }

        System.out.println("The most older dog is " + oldDog.name + ", breed " + oldDog.breed + "!");
    }
}



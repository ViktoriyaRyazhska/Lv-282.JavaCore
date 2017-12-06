package com.company;

public class Dog {
    String name;
    //String breed;
    int age;

    public Dog(String fil) {
    }

    public enum Breed {
        BEAGLE, CHIHUAHUA, DACHSHUND, MALAMUTE, DALMATIAN, COLLIE;
    }


    Breed breed;



    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }


}

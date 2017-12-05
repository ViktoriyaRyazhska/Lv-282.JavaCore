package com.company;

public abstract class Bird {

    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();

    public void haveFeathers() {
        if (feathers == true) {
            System.out.println("I am feathery");
        } else {
            System.out.println("i am not feathery");
        }

    }
    public void canLayEggs() {
        if (layEggs == true) {
            System.out.println("I am lay eggs");
        } else {
            System.out.println("I am not lay eggs");
        }

    }



}

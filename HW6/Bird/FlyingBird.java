package com.company;

public abstract class FlyingBird extends Bird{


    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird: I can fly");

    }
}
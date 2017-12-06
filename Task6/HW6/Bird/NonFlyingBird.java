package com.company;

public class NonFlyingBird extends Bird{


    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird: I can not fly");
    }
}
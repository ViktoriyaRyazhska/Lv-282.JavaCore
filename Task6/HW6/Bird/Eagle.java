package com.company;

public class Eagle extends FlyingBird{


    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Eagle: I fly fast ");
    }
}
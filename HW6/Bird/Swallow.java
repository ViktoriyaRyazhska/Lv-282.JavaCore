package com.company;

public class Swallow extends FlyingBird{


    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.print("Swallow: I fly beautiful, is ");
    }
}
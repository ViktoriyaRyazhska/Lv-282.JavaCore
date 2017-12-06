package com.company;

public class Chicken extends NonFlyingBird{

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);

    }
    @Override
    public void fly() {
        System.out.println("Chicken: I can not fly" );
    }
}
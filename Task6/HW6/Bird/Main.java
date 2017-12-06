package com.company;

public class Main {

    public static void main(String[] args) {

        Bird[] myBird = new Bird[4];

        myBird[0] = new Eagle(true, true);
        myBird[1] = new Swallow(true, true);
        myBird[2] = new Penguin(false, true);
        myBird[3] = new Chicken(true, true);

    for (int i = 0; i < myBird.length; i++){
        myBird[i].fly();
        myBird[i].haveFeathers();
        myBird[i].canLayEggs();

    }


    }
}

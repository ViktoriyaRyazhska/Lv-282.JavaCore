package com.company;

public class MaxMin {

    int a = 0;
    int b = 0;
    int c = 0;

    public MaxMin(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


    public void getResult () {
        if (a <= b && a <= c) {
            System.out.println("min value = " + a);
        }
        if (a >= b && a >= c) {
            System.out.println("max value = " + a);
        }
        if (b <= a && b <= c) {
            System.out.println("min value = " + b);
        }
        if (b >= a && b >= c) {
            System.out.println("max value = " + b);
        }
        if (c <= a && c <= b) {
            System.out.println("min value = " + c);
        }
        if (c >= a && c >= b) {
            System.out.println("max value = " + c);
        }

    }


}

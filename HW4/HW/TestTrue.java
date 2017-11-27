package com.company;

public class TestTrue {

    float i = 0f;

    public TestTrue(float i) {
        this.i = i;
    }

    public float getI() {
        return i;
    }

    public void setI(float i) {
        this.i = i;
    }

    public void test() {
        if (i <= 5f && i >= -5f) {
            System.out.println("Your number " + this.i + " belongs to the range [-5,5]");

        } else {
            System.out.println("Your number " + this.i + " dose not belongs to the range [-5.5];");
        }


    }
}
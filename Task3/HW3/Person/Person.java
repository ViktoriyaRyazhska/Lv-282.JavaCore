package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Person  {

    private String name;
    private int birthYear;

    public  Person(){}

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(){
        return 2017 - this.birthYear;
    }

    public void changeName (String name) {
        this.name = name;
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void input() throws IOException {
        System.out.print("Input name:");
        this.name = br.readLine();
        System.out.print("Input your birthday year:");
        this.birthYear = Integer.parseInt(br.readLine());
    }

    public void output() {
        System.out.println("The " + this.name + " was born in " + this.birthYear);
    }

    @Override
    public String toString()  {
        return "Person{" + "name = " + name + ", birthYear = " + birthYear + ", Age = " + getAge() + "}";
    }

}

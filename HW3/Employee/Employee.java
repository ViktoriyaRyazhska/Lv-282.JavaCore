package com.company;

public class Employee  {

    static private int number = 0;
    static private double sumRate = 0;
    static private double sumHours = 0;

    private String name;
    private int rate;
    private int hours;


    public Employee() {number++;}


    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        number++;
        sumRate = sumRate + rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        sumRate = sumRate + rate;
        sumHours = sumHours + hours;
        number++;
    }


    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
        sumRate = sumRate + rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        sumHours = sumHours + hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  double getSalary() {
        return (double) rate * hours;
    }

    public void changeRate(int rate) {
        sumRate = sumRate - this.rate;
        this.rate = rate;
        sumRate = sumRate + rate;
    }

    public  double getBonuses() {
        return (double) (rate * hours)/10;
    }
    public  static double getToSum() {
        return (double) sumRate * sumHours * number;
    }

    @Override
    public String toString() {
        return "Employee {Name = " + name + ", Rate = " + rate + " UAH, Hours = " + hours + ", Salary = "  + getSalary()
                + " UAH, Bonuses = " + getBonuses() + " UAH}";
    }

}

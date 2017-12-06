package com.company;

public class SalariedEmployee extends Employee implements CalculatePay {

    private int socialSecurityNumber;
    private double fixedPaymentOfMonth;

    public SalariedEmployee(String nameWorker, int socialSecurityNumber, double fixedPaymentOfMonth) {
        super(nameWorker);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedPaymentOfMonth = fixedPaymentOfMonth;
    }


    @Override

    public double calculatePay() {
        return fixedPaymentOfMonth;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + nameWorker + ", SSN = " + socialSecurityNumber
                + ", Payment = " + fixedPaymentOfMonth + '}';
    }
}

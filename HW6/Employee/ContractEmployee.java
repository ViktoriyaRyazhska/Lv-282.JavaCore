package com.company;

public class ContractEmployee extends Employee implements CalculatePay {

    private String federalTaxIdmember;
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String nameWorker, String federalTaxIdmember, double hourlyRate, double hoursWorked) {
        super(nameWorker);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" + nameWorker + ", federal Id = "
                + federalTaxIdmember + ", Payment = " +  calculatePay() + '}';
    }
}

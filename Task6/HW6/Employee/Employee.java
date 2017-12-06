package com.company;

public abstract class Employee implements CalculatePay {

    public String nameWorker;

    public Employee(String nameWorker) {
        this.nameWorker = nameWorker;
    }

    public static void getSortByPayment(Employee[] emp) {


        for (int i = 1; i < emp.length; i++) {
            Employee newElement = emp[i];
            int location = i - 1;
            while (emp[location].calculatePay() > newElement.calculatePay()) {
                emp[location + 1] = emp[location];
                location--;
            }
            emp[location + 1] = newElement;
        }

        for (int i = 0; i < emp.length; i++){
            System.out.println(emp[i]);
        }
    }

}

//       for (int i = 0; i < emp.length-1; i++) {
//        for (int j = i + 1; j < emp.length; j++) {
//        if (emp[i].calculatePay() < emp[j].calculatePay()) {
//        Employee tmp = emp[i];
//        emp[i] = emp[j];
//        emp[j] = tmp;
//        }
//        }
//        }
//        for (int i = 0; i < emp.length; i++){
//        System.out.println(emp[i]);
//        }
//        }
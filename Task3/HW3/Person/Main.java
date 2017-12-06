package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Person person1 = new Person();
        person1.input();

        Person person2 = new Person();
        person2.input();

        Person person3 = new Person();
        person3.input();

        Person person4 = new Person();
        person4.input();

        Person person5 = new Person();
        person5.input();



        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
    }
}

/*
        Input name:Oleg
        Input your birthday year:1986
        Input name:Julia
        Input your birthday year:1987
        Input name:Marta
        Input your birthday year:1988
        Input name:Igor
        Input your birthday year:1976
        Input name:Natalia
        Input your birthday year:1878
        Person{name = Oleg, birthYear = 1986, Age = 31}
        Person{name = Julia, birthYear = 1987, Age = 30}
        Person{name = Marta, birthYear = 1988, Age = 29}
        Person{name = Igor, birthYear = 1976, Age = 41}
        Person{name = Natalia, birthYear = 1878, Age = 139}

        Process finished with exit code 0
*/
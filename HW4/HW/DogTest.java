package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    @org.junit.Test
    public void getName() throws Exception {
        Dog dogTest = new Dog("Fil", 12, Dog.Breed.CHIHUAHUA);
        assertEquals("Fil", dogTest.name);
    }


}
package com.company;

public class Animal {
    private static int classCounter = 0;
    public final int number;
    private final String name;

    public Animal(String name) {
        this.name = name;
        classCounter++;
        number = classCounter;
        System.out.println(name + " created. Instance is: " + number);
    }

    public int getNumber() {
        return number;
    }
}

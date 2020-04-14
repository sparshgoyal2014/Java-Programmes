package com.company;

public class Animal {

    private static int classCounter = 0;
    public final int instanceNumber ;
    private final String name;

    public Animal(String name){
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, Instance number: " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}

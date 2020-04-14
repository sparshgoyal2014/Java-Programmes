package com.company;

public class Animal {
    public String name = "Ainmal";
    private int number;
    public String name2 = " Test variable of Animal";
    public final String name3;

    public final static int number2 = 5;

    public Animal(){
        name3 = "Some Animal";
    }


    public String getName() {
        return this.name;

    }
}

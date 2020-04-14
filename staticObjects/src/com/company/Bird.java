package com.company;

public class Bird {
    public Bird(){
        System.out.println("This is Defult Constructor");
    }

    public Bird(int number){
        System.out.println("This is parameterized Constructor of Bird Class with parameter: " + number);
    }

    public Bird(Animal animal){
        System.out.println("This is Bird Class Constructor with parameter:" + animal.toString());
    }
}

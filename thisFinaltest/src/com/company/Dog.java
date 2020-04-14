package com.company;

public class Dog extends Animal{

    public int number = 2;   // variable hiding  (not shadowing)
    public Dog(String name) {
        super(name);
        System.out.println("This is Dog Classs Constructor With perimetr: " + name);
    }

    @Override
    public void print(){    // method overriding
        System.out.println("This is Print Method in Dog Class");
    }

}

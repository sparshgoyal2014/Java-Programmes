package com.company;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        System.out.println(super.schoolName);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out , REPEAT");
    }
}

package com.company;

public class Dog extends Animal {

    public String name = "Dog";

    @Override
    public void display() {
        System.out.println("This is Dog class extending Animal class");
    }

    public void test(){
        System.out.println("This is Test method in dog Class");
    }
}

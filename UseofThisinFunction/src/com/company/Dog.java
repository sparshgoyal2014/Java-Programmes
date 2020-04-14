package com.company;

public class Dog extends Animal{
    public String name = "Dog Class";

    public void printAnimalDisplay(){
        display(this);
    }

    public void print(){
        System.out.println("This is Print method in Dog Class");
    }
}

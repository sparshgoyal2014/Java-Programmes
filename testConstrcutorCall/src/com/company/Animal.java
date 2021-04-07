package com.company;

public class Animal {

    public void display(){
        System.out.println("This is display method of Animal class");
    }

    public Animal(){
        System.out.println("This is Animal Class Constructor");
        display();
    }

}

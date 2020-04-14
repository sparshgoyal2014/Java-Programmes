package com.company;

public class Animal {
    public String nameAnimal= "Animal";

    public void display(){
        System.out.println("This is display method in Animal Class");
        this.testMethod();
    }

    public void testMethod(){
        System.out.println("This is Test Method in Animal Class");
    }
}

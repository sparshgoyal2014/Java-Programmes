package com.company;

public class Dog extends Animal {
    public Dog(Animal animal){
        System.out.println("THis is Dog class constructor extending Animal Class");
        animal.display();
    }

    @Override
    public void display() {
        System.out.println("This is Dog class Display Method overriding Animal Class display Method");
    }
}

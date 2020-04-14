package com.company;

public class Dog extends Animal {
    public String name = "Dog Class";

    public void display(){
        System.out.println("This is dog Class");
        System.out.println(number);
        System.out.println(this.number);
//        System.out.println(Animal.this.number);
    }
}

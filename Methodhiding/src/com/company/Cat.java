package com.company;

public class Cat extends Animal {
    public String name = "Hey its Cat";

    @Override
    public void display() {
        System.out.println("This is cat class");
    }

    public void printName(){
        System.out.println("Cat");
    }

    public static void staticDisplay(){
        System.out.println("This is Static method Of Cat Class");
    }


}

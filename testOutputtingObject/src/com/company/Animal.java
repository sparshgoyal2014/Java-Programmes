package com.company;

public class Animal {

    public String name = "Animal Classs";

    Animal(){
        System.out.println("This is Animal Class constructor");
        display();
    }

    public void display(){
        System.out.println("This is display method of Animal Class");
        Animal animal = new Animal();
    }

    @Override
    public String toString() {
        return super.toString();
//        return "Animal object! :)";
    }
}

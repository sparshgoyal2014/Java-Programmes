package com.company;

public class Animal {

    public String name = "Animal Class";

    public void display(Animal animal){
        System.out.println("This is method of Animal Class with perimeter reference of type Dog");
        System.out.println(animal.name);
        animal.print();
    }

    public void print(){
        System.out.println("This is Print method in Animal Class");
    }
}

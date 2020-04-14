package com.company;

public class Animal {

    public int number;

    public final int constantNumber = number;
    public Animal(String name){
        System.out.println("Animal Class Constructor with perimeter: " + name);
    }

    public Object display(){
        System.out.println("=========================================");
        System.out.println("This is display method of Animal class");
        this.print();
        System.out.println(this instanceof Dog);
        System.out.println("=========================================");
        return 1;

    }

    public void print(){
        System.out.println("This is Print method in Animal Class");
    }

}

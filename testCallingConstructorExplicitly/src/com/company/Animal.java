package com.company;

public class Animal {

    Animal(){
        System.out.println("This is animal Class Default Constructor");
    }

    Animal(Dog dog){
        System.out.println("THis is Animal Class constructor with parameter as Dog reference");
    }

    Animal(int number){
        System.out.println("This is Animal Class constructor with integer parameter.");
    }

    void display(){
        System.out.println("This is display method of Animal Class");
    }

}

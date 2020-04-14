package com.company;

public class Animal {
    String name = "Animal";

//    public Animal(){
//        System.out.println("This is default Animal Class Constructor");
//    }
//
//    public Animal(int number1, int number2){
//        System.out.println("This is Animal class Constructor with 2 parametres:" + number1 + " " + number2);
//    }
//
    public Animal(int number){
        System.out.println("This is Animal Class Constructor with parameter " + number);
    }

    public void display(){
        System.out.println("This is display method of Animal Class");
    }

}

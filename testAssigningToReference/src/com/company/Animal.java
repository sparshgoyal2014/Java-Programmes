package com.company;

public class Animal {
    public String name = "Animal Class";

    public Animal(int number){
        System.out.println("This is parameterized constructor " + number );
    }
    public void display(){
        System.out.println("This is display method of Animal Class");
    }
}

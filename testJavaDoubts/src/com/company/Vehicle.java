package com.company;

public abstract class Vehicle {
    public int number = 5;

    public Vehicle(){
        System.out.println("This is constructor");
    }

    public abstract void move();

    public void display(){
        System.out.println("This is display method of Vehicle Class");
    }

    public int getNumber(){
        display();
        return number;
    }



}

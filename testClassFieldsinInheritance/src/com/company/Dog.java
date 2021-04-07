package com.company;

public class Dog extends Animal{

    public String dogname = "german Shephered";

    @Override
    public void display() {
        System.out.println("This is display method of Dog Class");
    }

    public Dog(){
        System.out.println("This is default constructor of Dog Class");
    }
    public Dog(String dogname){

        this.dogname = dogname;
    }
}

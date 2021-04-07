package com.company;

public class Laptop extends Device {
    public void display(){
        System.out.println("This is display method of Laptop Class");
    }

    public Laptop(){
//        super(super.name);  // Cannot reference 'Device.name' before supertype constructor has been called

        super("hello");
    };
}

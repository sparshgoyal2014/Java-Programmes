package com.company;

public class Device {

    public String name;

     void display(){
        System.out.println("This is PRIVATE display method of Device Class");
    }

    public Device(String name){
         this.name = name;
    }
}

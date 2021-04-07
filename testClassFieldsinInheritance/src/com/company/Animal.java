package com.company;

public class Animal {

    public String name = "Animal Class";

    public void display(){
        System.out.println("This is display method of Animal Class");
    }

    public Animal(){
        System.out.println("This is Animal Class default constructor");
    }

    public Animal(String name){
        this.name = name;
    }

    public void changeName(String newName){
        this.name = newName;
        System.out.println(getClass().getName());
    }

}

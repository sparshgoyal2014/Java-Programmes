package com.company;

public class Animal {
    public String name = "Animal Class";
    public int number;

    Animal(){

    }

    Animal(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("This is display method of Animal Class");
    }

    public void test(){
        display();
        this.display();
    }
}

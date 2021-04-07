package com.company;

public class Animal {

    public String name = "Animal Class";

    public void display(){
        System.out.println("This is Animal Class display method");
    }

    public void changeName(){};

    public void test(){
        System.out.println(this instanceof Dog);
    }

}

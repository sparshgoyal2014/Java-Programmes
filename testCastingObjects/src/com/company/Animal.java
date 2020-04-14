package com.company;

public class Animal {
    public void display(){
        System.out.println("this is Display Method of Animal Class");
    }

    public Bird testFunction(){
        System.out.println("This is test method of Animal Class");
        return new Bird();

    }
}

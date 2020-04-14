package com.company;

public class Animal {
    private String name = "Animal";
    public static void display(){
        System.out.println("This is Animal Class static display method");
        System.out.println(new Animal().name);
    }
}

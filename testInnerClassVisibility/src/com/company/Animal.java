package com.company;

public class Animal {
    private String name = "Animal";
    public void display(){
        System.out.println("This is Display Method of Animal Class");
        System.out.println(name);
        System.out.println(Dog.);
    }


    public class Dog{
        public String nameInner = "Dog";

        public void displayInner(){
            System.out.println("This is displayInner Method of Inner class in the Animal Class");
            System.out.println(name);
        }
    }
}

package com.company;

public class Animal {

    public Bird bird = new Bird(){
        @Override
        public void display() {
            System.out.println("This is overloaded Display method of Annoymous Inner class");
        }
    };

    public void display(){
        System.out.println("This is display method of Animal Class");
    }
}

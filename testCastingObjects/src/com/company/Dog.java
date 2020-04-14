package com.company;

public class Dog extends Animal {
    @Override
    public void display() {
        System.out.println("This is display method of dog Class");
    }

    public Bird testFunction(){
        System.out.println("This is Test method in Dog Class");
        return new Bird();
    }
}

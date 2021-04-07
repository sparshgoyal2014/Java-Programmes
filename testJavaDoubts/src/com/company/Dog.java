package com.company;

public class Dog implements Animal {

    public static final int number = 3;
    @Override
    public void display() {
        System.out.println("This is display method of Dog Class");
        System.out.println(number);
    }


}

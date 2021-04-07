package com.company;

public class Dog  extends Animal{

    public String name = "Dog Class";

    public void test(){
        System.out.println("THis is Dog Class test method");
    }

    @Override
    public void display() {
        super.display();
//        super.test();

    }
}

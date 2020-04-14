package com.company;

public class Dog extends Animal{

    public int number = 10;

    @Override
    public void display(){
//        super.display();
        System.out.println("This is Dog Class");
        this.print();
    }

    @Override
    public void displayNumber() {
        System.out.println(number);
        System.out.println(this.number);
    }

    @Override
    public void print(){
        System.out.println("This is Dog Class Print function");
    }
}

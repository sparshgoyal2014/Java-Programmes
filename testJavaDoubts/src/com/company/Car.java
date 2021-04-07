package com.company;

public class Car extends Vehicle {

    public int number = 23;

    @Override
    public void move() {
        System.out.println("come-on man move the Car");
        System.out.println(super.number);
        System.out.println(Car.this.number);
    }

    @Override
    public void display() {
        System.out.println("This is display method of Car Class");
    }

    public void test(){
        System.out.println(getNumber() + ": a number");
    }
}

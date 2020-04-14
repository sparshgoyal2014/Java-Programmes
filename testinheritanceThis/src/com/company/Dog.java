package com.company;

public class Dog extends Animal {
    public int number = 6;

    @Override
    public void display() {
        super.display();
        System.out.println(this.number);
    }

    @Override
    public void test() {
        System.out.println("This is test function in Dog Class");
    }

}

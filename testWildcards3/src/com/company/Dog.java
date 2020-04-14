package com.company;

public class Dog extends Animal {

    public int number = 0;

    public Dog(int number){
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("This is dog class display method");
    }

    public void specialMethod(int i){
        System.out.println("This is special method of Dog Class " + i);
    }
}

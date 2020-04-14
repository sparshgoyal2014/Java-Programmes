package com.company;

public class Animal {

    int number = 5;

    static Bird bird = new Bird(Animal.this);
    public Animal(){
        System.out.println("This is Animal Class");
    }

    public void test(){
        Animal animal = new Dog(this);

    }

    public static void display(){
        System.out.println("This is display Method in Animal Class");
        System.out.println(number);
    }

    public void testThis(){
        this.display();
    }
}

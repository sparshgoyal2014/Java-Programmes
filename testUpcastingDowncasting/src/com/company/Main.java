package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.display();
        animal.test();
        System.out.println(animal.getClass().getName());
        System.out.println(animal);

        Animal animal1 = null;

        System.out.println(animal1.getClass().getName());
    }
}

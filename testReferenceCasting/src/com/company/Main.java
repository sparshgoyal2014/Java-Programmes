package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
        ((Animal)dog).display();
        System.out.println(((Animal)dog).name);

        Animal animal = new Dog();
        System.out.println(new Dog() instanceof Main);

    }
}

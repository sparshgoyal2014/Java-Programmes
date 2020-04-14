package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.setNumber(10);

        Dog dog = new Dog();
//        dog.setNumber(3);


        Animal hybrid = new Dog();
//        hybrid.setNumber(4);


        animal.display();
        dog.display();
        hybrid.display();

        System.out.println(animal.number);
        System.out.println(dog.number);
        System.out.println(hybrid.number);

        Dog dog1 = (Dog)hybrid;
    }
}

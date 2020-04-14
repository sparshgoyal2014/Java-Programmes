package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal();
        animal.display();
        System.out.println("================================");

        Animal animal1 = new Dog();
        animal1.display();
        System.out.println("================================");

        Dog dog = new Dog();
        dog.display();
        System.out.println("================================");

        Animal animal2 = new Cute();
        animal2.display();

        System.out.println("++++++++++++++++++++++++++++++");

        dog.dogDisplay();

    }
}

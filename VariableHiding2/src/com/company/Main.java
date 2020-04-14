package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Dog();
        System.out.println(animal.number);
        animal.display();
        System.out.println(((Dog)animal).number);

//        System.out.println((Dog)new Animal() instanceof Animal);

        Dog animal1 = (Dog)new Animal();

    }
}

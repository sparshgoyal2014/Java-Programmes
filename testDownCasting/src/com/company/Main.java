package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Animal animal2 = new Breed();

        Animal animal3 = null;

        System.out.println(animal3 instanceof Animal);

	    Dog dog = (Dog) animal2;
	    dog.display();
    }
}

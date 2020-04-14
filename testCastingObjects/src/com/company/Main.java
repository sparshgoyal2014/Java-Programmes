package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog();
//        Animal animal = (Animal) dog.testFunction();

        System.out.println(dog.testFunction() instanceof Animal);
    }
}

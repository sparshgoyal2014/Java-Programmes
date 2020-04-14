package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog();
        System.out.println(dog.getName());

        Cat cat = new Cat();
        cat.display();

        System.out.println(Animal.number2);
    }
}

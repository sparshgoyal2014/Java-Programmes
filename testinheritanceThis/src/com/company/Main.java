package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal();
	    animal.display();

		System.out.println("====================================");

	    Dog dog = new Dog();
	    dog.display();
		System.out.println("====================================");

	    Animal animal1 = new Dog();
	    animal1.display();
		System.out.println("====================================");

		dog.print();
		System.out.println(dog.number);

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
//	    Dog dog = (Dog) new Animal();
	    Animal animal = new Animal();
//	    Dog dog2 = (Dog) animal;

	    Dog dog3 = new Dog();
        System.out.println(dog3 instanceof Object);
        System.out.println(dog3 instanceof Animal);
        System.out.println(new Dog() instanceof Animal);
        System.out.println(dog3 instanceof Animal);

        Object object = new Animal();
        Animal animal1 = (Animal) object;

        Animal animal2 = new Dog();
        System.out.println(animal2 instanceof Animal);
        System.out.println(animal instanceof Dog);


        System.out.println();
    }
}

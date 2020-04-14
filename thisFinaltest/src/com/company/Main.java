package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Animal("animal Constructo");
        animal.display();
        System.out.println(animal.constantNumber);
        System.out.println(animal.number);

        Dog dog = new Dog("dog Constructor");
        dog.display();

        Animal animal1 = new Dog("Animal Class reference And Dog class Instance");
        animal1.display();

        /***
         * Note: run Time polymorphism is occuring in 'this' operator.
         */


    }

    public void testMethod(){
        System.out.println("This is test method");
    }
}

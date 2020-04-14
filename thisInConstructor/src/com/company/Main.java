package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Animal animal = new Dog(new Animal());
        Animal animal = new Animal();

        System.out.println("*****************************************");
        animal.test();
        System.out.println("*****************************************");

        System.out.println("========================================================");
        Animal animal1 = new Dog(new Animal());
        animal1.testThis();
    }
}

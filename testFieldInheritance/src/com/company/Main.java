package com.company;

public class Main {


    int x = 2;




    public static void main(String[] args) {
	// write your code here

        Dog dog = new Dog("old name", 4);
        dog.display();

        System.out.println(dog.name);

        Animal animal = new Dog("hi", 23){

        };

        animal.test();


        Animal animal1 = new Animal();

        Dog dog1 = (Dog) animal1;

        

    }
}

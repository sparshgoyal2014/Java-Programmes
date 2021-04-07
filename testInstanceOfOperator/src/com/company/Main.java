package com.company;

public class Main {


    public static void display(Animal animal){

        System.out.println(animal instanceof Dog);


    }



    public static void main(String[] args) {
	// write your code here

        Object object = new Animal();

        Animal animal = new Dog();

        if(object instanceof Dog){

        }

        Object object2 = new Object();

        System.out.println((Animal)object2);


    }

}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Animal animal = new Dog();
//        Dog dog = (Dog) animal;
//        Animal animal1 = (Dog)dog;
////        Dog dog1 = animal;
//
//        Animal animal2 = new Animal();
//
//        Dog dog1 = (Dog) new Animal();
//        Dog dog2 = (Dog) animal2;
//
//        Animal animal3 = (Animal)new Dog();
//
//        /***
//         * A Very Important Note: upcasting and downcasting don't change the actual Object.only the reference type gets Changed.
//         */
//
//        List<Integer> list = new ArrayList<>();

//        System.out.println(((Dog)new Animal()).name);
//        list.add(1);

//        Double d = 1;

        System.out.println(new Animal() instanceof Animal);
//        System.out.println(new Animal() instanceof new Animal());
        System.out.println(new Dog() instanceof Animal);

        String name = "sachin";
        name.concat("asd");
    }
}

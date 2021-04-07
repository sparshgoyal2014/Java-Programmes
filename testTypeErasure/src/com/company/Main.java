package com.company;

import java.util.ArrayList;

class Dog{

}

class Bird{

}


class Animal<T>{
    T field = (T)new Dog();


    public void display() {
        System.out.println(field);
    }

}


public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal<Bird> animal = new Animal<>();

        System.out.println(animal.field);

        Bird integer = animal.field;

        ArrayList<?> arrayList = new ArrayList<Integer>();

    }

}

package com.company;

import java.util.HashSet;
import java.util.Iterator;

class Animal{
    public String name = "AnimalClass";

    public void display(){
        System.out.println("This is display method of Animal Class");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("abc");
        hashSet.add("def");
        hashSet.add("ghi");

        System.out.println(hashSet);

        Iterator<String> iterator = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };

        hashSet.

        Animal animal = new Animal();
        System.out.println(animal);
    }
}

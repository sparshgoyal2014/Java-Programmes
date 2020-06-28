package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal<Dog> animal = new Animal<>();

        animal.display();

        animal.getObject().display();



        Set<String> set = new HashSet();
    }
}

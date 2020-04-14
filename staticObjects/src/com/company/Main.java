package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal();
        animal.test();
        System.out.println(Animal.bird);

        int a = 5;
        double dNumber = (float)a;

        int number = (int)1.2;


        Integer i = 3.5;
        Double d = (double)1;
        double d2 = 1;
        System.out.println(new Animal() instanceof Animal);
    }
}

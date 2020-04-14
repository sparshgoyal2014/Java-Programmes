package com.company;

import java.lang.reflect.Array;


public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Dog";

        Animal animal1 = new Animal();
        animal1.name = "Cat";

        Animal animal2 = new Animal();
        animal2.name = "Cow";


        Animal[] arrObj2;
        arrObj2 = new Animal[]{animal, animal1, animal2};

        arrObj2[0].name = "Bat";

        System.out.println(animal.name);

        double dArray[] = new double[10];
        dArray[0] = 1.2;

        for(double i : dArray){
            System.out.print(i + " ");
        }

        double dValue = 1;
        System.out.println(dValue);
        

    }
}

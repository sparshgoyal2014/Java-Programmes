package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Number number = 2.3;
        System.out.println(number.intValue());

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        for(Number o: arrayList){
            System.out.println(o);
        } */

        /*
        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog(1));
        arrayList.add(new Dog(2));
        arrayList.add(new Dog(3));
        arrayList.add(new Dog(4));
        arrayList.add(new Dog(5));
        arrayList.add(new Dog(6));
        arrayList.add(new Dog(7));

        for(Dog animal : arrayList){
//            animal.display();
            animal.specialMethod(animal.number);
        }
         */

        Animal animal = new Dog(1);
        Object object = animal;

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for(Integer i: list){

        }

    }
}

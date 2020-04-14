package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        ArrayList arrayList = new ArrayList();
//        arrayList.add("String1");
//        arrayList.add("String2");
//        arrayList.add(new String("string3"));
//        arrayList.add(2);
//
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));
//
//        Object string1 = arrayList.get(0);
//        System.out.println(string1 instanceof String);

        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        Animal animal1 = new Dog();
//        Bird bird1 = (Bird) animal1;
//        dog = (Dog) bird;

//        ArrayList<?> arrayList = new ArrayList<>();
//        arrayList.add(1);

        List<String> list = new ArrayList<>();
        list.add("String1");
        addentries(list);

    }

    public static void addentries(List rawList){
        rawList.add(1);
    }
}

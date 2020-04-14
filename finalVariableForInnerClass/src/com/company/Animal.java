package com.company;

import java.util.ArrayList;

public class Animal {
    public void display(){
        System.out.println("This is Display Method for Animal Class");
    }

    public void test(){
        int number = 5;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");

         class Inner{
            public void innerDisplay(){
                System.out.println("This is InnerDisplay Function of inner class");
                System.out.println(number);
                System.out.println(arrayList);
            }
        }
    }

}

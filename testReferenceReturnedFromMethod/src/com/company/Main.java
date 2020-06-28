package com.company;

import com.sun.management.GarbageCollectionNotificationInfo;

public class Main {
    public static Object display(){
        System.out.println("This is display method in Main Class");

        return new Object();
    }


    public static double doubleReturnType(){
        int x = 5;
        return x;
    }

    public static void print(Object object){
        System.out.println(object);
    }

    public static void main(String[] args) {
	// write your code here
//        System.out.println((Integer)display());

//        Object object = new Animal();
//
//        System.out.println((Dog)object);

        System.out.println(doubleReturnType());

      display() = new Animal();

    }
}

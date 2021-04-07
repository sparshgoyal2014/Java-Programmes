package com.company;

public class Vehicle {

    public static  int i;
    public int y;

    static {
        i = 20;
        System.out.println("This is static Block");
    }

    Vehicle(){
        System.out.println("This is vehicle constructor");
    }

}



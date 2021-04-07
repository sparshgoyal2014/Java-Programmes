package com.company;

class Parent{}

class Child extends Parent{}


public class Main {

    public static void main(String[] args) {
	// write your code here
//        Dog dog = new Dog(3);
/*
        if(3 == "hello"){
            System.out.println("Hello");
        }*/

        if(2l == 2.0f){
            System.out.println("Hi! There");
        }

        if(2.1d == 2.1f){
            System.out.println("Equal :)");
        }

        System.out.println(2.1f);
        System.out.println((double) 2.1d);
        System.out.println((double) 2.1f);
        System.out.println(2.1);


        Parent parent = new Parent();
        Child child = new Child();

        parent = child;

        if(parent == child){
            System.out.println("yes its true");
        }

        int c = null;

    }
}

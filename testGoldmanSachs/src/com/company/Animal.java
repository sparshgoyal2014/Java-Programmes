package com.company;

public class Animal {

    public String name = "Animal Class";

    public void test(){
        System.out.println("This is ANimal Class test method");
    }

    public void display(){
        test();
        System.out.println("This is Animal Class Display function");

        System.out.println("hello, " + this.name);
    }

}

package com.company;

public class Animal {
    public int number = 4;
    public String name = "name";

    public void display(){
        System.out.println(this.number);
        System.out.println(number);
        this.test();
    }

    public void test(){
        System.out.println("This is test function in Animal Class");
    }

    public void print(){
        this.test();
    }
}

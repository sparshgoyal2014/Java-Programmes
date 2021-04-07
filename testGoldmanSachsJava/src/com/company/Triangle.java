package com.company;

public class Triangle extends Shape {

    public void test(){
        System.out.println("This is test method of Triangle class");
    }

    public void display(){
        super.test();
        this.test();
        test();
        System.out.println("This is display method of triangle class");
    }

}

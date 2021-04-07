package com.company;

public class Animal {


    public String name = "Animal Class";


    public void display(){
        System.out.println("This is display method of Animal Class");
        this.test();
        test();
    }


    public void test(){
        System.out.println("This is test method of Animal CLass");
    }

    public void testField(){}

}

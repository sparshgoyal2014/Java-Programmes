package com.company;

public class Dog extends Animal {

    public String name;

    @Override
    public void changeName(){
        this.name = "newName";
    }
//
//    public void test(){
//        System.out.println(this instanceof Dog);
//    }

}

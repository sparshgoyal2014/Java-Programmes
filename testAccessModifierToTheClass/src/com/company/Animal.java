package com.company;

public class Animal {

    public String name = "Dog";
    public Animal(){
        System.out.println("This is Animal class Constructor");
    }
    public void display(){
        System.out.println("This is Animal Class Display Method");
    }

    public static class Innner{
//        public String name = Animal.this.name;  // error
        public int number = 2;
        public int number2 = this.number;

        public static void test(){
            System.out.println("This is test method of Inner Class");
        }
    }






}

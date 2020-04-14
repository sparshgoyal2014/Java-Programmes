package com.company;

public class Animal {
    public int number = 1;
    public String name = "Animal";
    public static double dNumber = 1.20;

    public void display(){
        System.out.println("This is Animal Class");
        System.out.println(this.number);
        this.print();  // prints subClass Method
        print();       // Prints SubClass Method
        System.out.println(this.dNumber);
        this.testStaticMethod();
        System.out.println("------------------------------");
        System.out.println(this instanceof Dog);
    }

    public void print(){
        System.out.println("This is Print function in Animal Class");
    }

    public static void testStaticMethod(){
        System.out.println("This is test Static method in Animal class");
    }
}

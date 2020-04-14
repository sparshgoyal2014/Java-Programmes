package com.company;

public class Dog extends Animal{
    public int number = 2;


//    public void print(){
//        System.out.println("This is Print method in Dog Class");
//    }


    public static void testStaticMethod(){
        System.out.println("this is testStaticMethod in Dog Class");
    }

    @Override
    public void print() {
        System.out.println("THis is Print method in Dog Class");
    }

    public void dogDisplay(){
        this.print();

    }
}

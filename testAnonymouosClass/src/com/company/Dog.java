package com.company;

public class Dog extends Animal {


    Dog(int number){
        super(number);
        System.out.println("This is Parameterized Constructor in Dog Class");
    }


    public void test(){
        System.out.println("This is Test Method of Dog class Extending Animal Class");
        System.out.println(Inner.number);
    }

    class Inner{
        static final int number = 5;
//        static int number2 = 3;
    }


}

package com.company;

public class Dog extends Animal {

    Dog(){
        super();
    }


    Dog(int number){

//        super(test());
//        super(this);
//        super(new Dog());

        System.out.println("THis is Dog class constructor with integer parameter.");

    }



    void test(){
        System.out.println("THis is test function of Dog Class");

    }


}

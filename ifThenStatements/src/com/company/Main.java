package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an Alien");
        }

        int number = 5;
//        if(number){  // error: like in C++, we can't do the same in java
//            System.out.println("we are in the if Block");
//        }


        /****  ternary Operator *****/  // It emans The operator takes THREE operands

        boolean wasaCar = isAlien ? false : true;  // three opernds
        System.out.println(wasaCar);

        int ageOfClient = 20;
        boolean isEighteenorOver = ageOfClient == 20 ? true : false;



    }

}
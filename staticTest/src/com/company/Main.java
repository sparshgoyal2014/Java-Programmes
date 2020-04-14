package com.company;

public class Main {

    public int multiplier = 7;

    public static void main(String[] args) {
	// write your code here
//        StaticTest firstInstance = new StaticTest("first instance");
//        System.out.println(firstInstance.getName() + " is instance Number " + StaticTest.getNumInstance());
//
//        StaticTest secondinstance = new StaticTest("second Instance");
//        System.out.println(secondinstance.getName() + " is instance number " + StaticTest.getNumInstance());
//
//        StaticTest thirdinstance = new StaticTest("third Instance");
//        System.out.println(thirdinstance.getName() + " is instance number " + StaticTest.getNumInstance());

        int answer = multiply(6);
        System.out.println("The answer is: " + answer);


    }

    public int multiply(int number){
        return number*multiplier;
    }
}

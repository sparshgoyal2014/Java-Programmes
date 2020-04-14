package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /****
         * Note: in java you can only inherit from one class at a time;
         */

        Dimensions dimensions = new Dimensions(20,20,5);
        Case aCase = new Case("2208","Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch beast", "ACer", 27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4,5,"v2.44");
        PC thePc = new PC(aCase, monitor, motherboard);
        thePc.powerUp();
    }
}

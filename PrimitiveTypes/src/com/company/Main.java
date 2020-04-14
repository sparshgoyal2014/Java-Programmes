package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 10000;
        int maxintValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;
        System.out.println("Integer minimum value " + minIntValue);
        System.out.println("Integer maximum value " + maxintValue);

        int bustedMaxValue = maxintValue + 1;  // Overflow
        System.out.println(bustedMaxValue);

        int bustedMinValue = minIntValue - 1;
        System.out.println(bustedMinValue);  // Underflow


        //int maxIntTest = 21478564646546464465464;  //Error
        int number = 2_14_74_83_647;
        System.out.println(number);
    }
}

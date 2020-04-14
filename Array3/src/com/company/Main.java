package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // OR//
//        scanner = new Scanner(System.in);
        int[] iArray = getIntegers(5);
        for(int i=0; i<iArray.length; i++){
            System.out.println("Element " + i + ", typed value was " + iArray[i]);
        }

        System.out.println("The average is " + getAverage(iArray));

    }

    public static int[] getIntegers(int number){
        System.out.println(" Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
//            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }

        return (double)sum/(double)array.length;
    }
}

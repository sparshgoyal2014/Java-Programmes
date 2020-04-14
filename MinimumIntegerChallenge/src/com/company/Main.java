package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);

    }

    private static int[] readIntegers(int count){
        int[] iArray = new int[count];

        for(int i=0; i<count; i++){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            iArray[i] = number;
        }

        return iArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }

        return min;

    }

    private static void printaArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element #" + i + " = " + array[i]);
        }
    }
}

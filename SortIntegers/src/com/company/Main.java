package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*****
     * Note:
     * 1. If we try to access index that is out of range Java will give us an ArrayIndexOutOfBounds
     * Eception, which indicates taht the index is out of range in other words out of bounds.
     * 2. [] are called array access operator.
     * 3. The new Operaor or keyword is used to create the array and initialize the array elements to their default values.
     * 4. for Boolean array, elements they would be initialize to flase.
     * 5. for String or other objects that would be null
     */

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[] iArray = getIntegers(5);
        int[] sorted = sortIntegers(iArray);
        printArray(sorted);



    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter "+ capacity + " Integer values.\r");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }
//
        int[] sortedArray = Arrays.copyOf(array, array.length);


        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i< sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void swapNumbers(int x, int y){
        int temp;

    }
}
































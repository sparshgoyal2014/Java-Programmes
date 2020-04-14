package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] dArray = new double[10];
        int[] iArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        // OR //
        int []  iArray2 = {1,4,9};
//        iArray =  {1,2,3,4,5,6,7,8,9,10};  // error

        int[] iArray3 = new int[10];

        for(int i=0; i<10; i++){
            iArray3[i] = i;
        }

        for(int i=0; i<10; i++){
            System.out.print(iArray3[i] + " ");
        }

        System.out.println();

        for(int i=0; i< iArray3.length; i++){
            System.out.print(iArray3[i]);
        }
        System.out.println();

        printArray(iArray3);
    }

    public static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

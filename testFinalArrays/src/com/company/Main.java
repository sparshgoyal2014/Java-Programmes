package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int[] arr = {1,2,3,4,5};

        arr[0] = 5;


        int[] arr2 = {5,6,7,8,9};

        arr = arr2;

        final int arr3[] = {1,2,3,4,5};

        arr3[0] = 5;
    }
}

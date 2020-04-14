package com.company;

public class Main {

    public static int[] test(int[] input){
        input = new int[5];
        input[3] = 15;
        return input;
    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[15];
        arr = test(arr);
        System.out.println(arr[7]);
    }
}

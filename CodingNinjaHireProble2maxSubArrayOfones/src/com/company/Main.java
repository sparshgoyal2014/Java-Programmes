package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0) {
            int size = scanner.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }


        }

    }

    public static int longestSubArray(int[] arr, int size){   // longest subArray after removing twio elements

    }
}



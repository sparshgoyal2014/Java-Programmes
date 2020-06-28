package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is Main Thread");
        Thread thread = new SeparateThread();
        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            System.out.println("I couldn't wait, I was interrupted.");
//        }
////        thread.interrupt();

        Scanner input = new Scanner(System.in);

// take input from the user
        int number = input.nextInt();
        System.out.println("This is main Thread 2");

    }
}

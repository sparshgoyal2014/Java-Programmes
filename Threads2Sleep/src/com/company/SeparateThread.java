package com.company;

import java.util.Scanner;

public class SeparateThread extends Thread {
    @Override
    public void run() {
        System.out.println("This is Separate thread");
        Scanner input = new Scanner(System.in);

// take input from the user
        int number = input.nextInt();
//        try {
//            Thread.sleep(5000);
////            Thread.sleep(10000, 5000); // 2nd parameter is for nanoseconds to get precise results
//        } catch (InterruptedException e) {
//            System.out.println("Woke up");
//            return;
//        }

        System.out.println("Five seconds are Passed.");
    }
}

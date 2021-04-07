package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Thread thread = new Thread(new Animal());

        thread.start();


        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        int i = 0;
        while(i < 1000){
            System.out.println(i);
            i++;
        }



    }
}

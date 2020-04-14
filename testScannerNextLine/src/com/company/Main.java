package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int number1 = 0, number2 = 1;

        System.out.println("Enter number1...");
        scanner.nextInt();
        System.out.println("Enter number2...");
        scanner.nextInt();

        System.out.println("Your number1 = " + number1 + " and number2 = " + number2);

    }
}

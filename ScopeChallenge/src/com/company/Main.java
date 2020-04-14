package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter a number: ");
        X x = new X(scanner.nextInt());
        x.x();
    }
}

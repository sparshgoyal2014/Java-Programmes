package com.company;

public class Main {

    public static void recursionMethod(){
        System.out.println("This is recursive Method");
        Main.recursionMethod();
    }

    public static void main(String[] args) {
	// write your code here
        Main.recursionMethod();
    }
}

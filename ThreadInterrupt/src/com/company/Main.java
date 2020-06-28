package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is main Thread");
        Thread thread = new SeparateThread();
        thread.start();
        System.out.println("This is main Thread after initializing the SeparateThread instance");
    }

}

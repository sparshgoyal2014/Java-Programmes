package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread t1 = new MyThread();
        t1.setPriority(6);

        MyThread2 t2 = new MyThread2();
        t2.setPriority(2);

        t2.start();
        t1.start();

        System.out.println("hwllo This is main method");
        System.out.println();

    }
}

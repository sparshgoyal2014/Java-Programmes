package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String hello1 = new String("hello");
        String hello2 = new String("hello");

        System.out.println(hello1 == hello2);

        System.out.println(hello1.equals(hello2));


        String hello3 = "hello";
        System.out.println(hello1.equals(hello3));
        System.out.println(hello3.equals(hello2));


        System.out.print(hello1 == hello3);

    }
}

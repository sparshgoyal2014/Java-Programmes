package com.company;

class A{
    int x = 10;
}

class B extends A{
    int x = 20;
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        A a = new B();
        System.out.println(a.x);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        new Animal.Inner().display();
        new Inner();
        new Animal().new Inner();
    }
}

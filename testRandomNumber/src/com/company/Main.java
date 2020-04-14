package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x, y;
        x = randomNumber();
        y = randomNumber();

        System.out.println(x);
        System.out.println(y);
    }

    public static int randomNumber(){
        return (int)(Math.random() * 6) + 1;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 5;
        System.out.println(i);
        modify(i);
        System.out.println(i);
    }

    public static void modify(int x){
        x = x+1;
    }
}

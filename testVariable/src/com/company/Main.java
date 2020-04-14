package com.company;

public class Main {

    public static void alterInt(int x){
        System.out.println(x);
        x = 5;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int x = 2;
        System.out.println(x);
        alterInt(x);
        System.out.println(x);
    }
}

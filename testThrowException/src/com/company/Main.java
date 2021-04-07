package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");

//        throw new NullPointerException();


        try{
            throw new ArithmeticException();
        }catch (Exception e){
            System.out.println("No problem!");
        }


        if(true) System.out.println("hi");


        if(true){
            int x = 4;
        }

        if(int y = 2){

        }


    }
}

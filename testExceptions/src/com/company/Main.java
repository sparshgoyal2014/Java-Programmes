package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            try{
                throw new NullPointerException();
            }catch (ArithmeticException e){
                System.out.println("In arithmetic exception catch block");
            }
        }catch (NullPointerException e){
            System.out.println("In outer NullPointer Exception Catch Block");
        }

        if(false){
            System.out.println("aaf");
        }
    }
}

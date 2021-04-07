package com.company;

import com.sun.jdi.event.ExceptionEvent;

public class Main {

    public static void main(String[] args) {
	// write your code here

        if(2 == 2.0){
            System.out.println("This is always true");
        }

        double x = 

        try{
            System.out.println(1/0);
        }catch (Exception e){
            System.out.println("Exception handled");
        }finally{
            System.out.println("must execute this code");
        }
    }
}

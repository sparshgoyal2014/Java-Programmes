package com.company;

import java.io.IOException;

public class SeparateThread extends Thread {
    @Override
    public void run() {
        System.out.println("THis is Separate Thread");
        try {
            throw new NullPointerException();
        }catch(ArithmeticException e){

        }
    }
}

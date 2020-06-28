package com.company;

//import static com.company.ThreadColor.ANSI_BLUE;

import static com.company.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello From " + currentThread().getName());
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "Another Thread Woke me up");
        }

        System.out.println(ANSI_BLUE + "Three seconds are passed and I am Awake");
    }

    private final void display(){
        System.out.println("THis is Display Method of AnotherThreadClass");
    }
}

package com.company;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        int i=0;
        while(i < 40000){
            i++;
            System.out.println(i);
        }

    }
}

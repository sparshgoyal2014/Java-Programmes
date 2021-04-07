package com.company;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
//        try {
//            TimeUnit.SECONDS.sleep(30);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Sorry for the delay");
    }
}

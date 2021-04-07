package com.company;

public class Animal extends Thread {

    public int ropeCut(int length, int a, int b, int c){
            if(length == 0)return 0;
            if(length < 0)return -1;
//        System.out.println("executing");

            int result = Math.max(Math.max(ropeCut(length-a,a,b,c), ropeCut(length-b,a,b,c)), ropeCut(length-c,a,b,c));
            if(result == -1)return -1;
            return 1+result;
    }

    @Override
    public void run() {

        ropeCut(20,1,1,1);
        System.out.println("Finally function finished!!");
    }
}

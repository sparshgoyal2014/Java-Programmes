package com.company;

public class Main {


    public static int maxCuts(int length, int a, int b, int c){


        if(length == 0)return 0;
        if(length < 0)return -1;


        int result = Math.max(Math.max(maxCuts(length-a,a,b,c), maxCuts(length-b,a,b,c)), maxCuts(length-c,a,b,c));
        if(result == -1)return -1;
        return 1+result;
    }
    public static int displayNumber(){

        final int[] result = {-1};
        new Thread(new Runnable() {
            public void run()
            {

                // perform any operation
                System.out.println("New Thread inside display method");

                // check if listener is registered.
                result[0] = maxCuts(5,1,1,1);

            }
        }).start();

        return result[0];
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(displayNumber());



    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            int i, sum;

            sum = 10;
            for(i = 1; i<3; i++);


            i = 0;
            System.out.println(i);
            System.out.println("Successfully reached here!");
            sum = sum/i;

            System.out.println(sum);
        }catch (ArithmeticException e){
            System.out.println("0");
        }
    }
}

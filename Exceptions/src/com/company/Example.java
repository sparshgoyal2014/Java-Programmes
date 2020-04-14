package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        }catch (NoSuchElementException | ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform Division.Autopilot shutting down;");
        }

    }

    private static int divide(){
        int x, y;
//        try{
            x = getInt();
            y = getInt();
            System.out.println("x is: " + x + ", y is: " + y);
            return x/y;  // integer division
//        }catch (NoSuchElementException e){  // try block is same as the other blocks in java, as the scope is concerned.
//            throw new NoSuchElementException("No suitable input");
//        }catch(ArithmeticException e){
//            throw new ArithmeticException("Attempt to divide by zero");
//        }

    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an integer: ");
        while(true){
            try{
                return scanner.nextInt();
            }catch (InputMismatchException e){
                // go round again, Read past the end of line in the input first
                scanner.nextLine();
                System.out.println("Please Enter a Number using only the digits form 0-9");
            }//catch (NoSuchElementException e){
//                throw new ArrayIndexOutOfBoundsException("just kidding");
//            }

            /***
             * ImpNote:
             * if the exceptions are not catched in the inner blocks then it might be catched in the outer catch blocks if mentioned.
             */
        }
    }
}


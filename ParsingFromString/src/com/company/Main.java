package com.company;

public class Main {

    public static void main(String[] args) {
        // Note: Parsing means converting string into another data type
//        String numberAsString = "2018a"; // numberFormatException
        String numberAsString = "2018";
        System.out.println(" numberAsString = " + numberAsString);

        // We can convert into other primitive types by using parsing methods

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);


    }
}

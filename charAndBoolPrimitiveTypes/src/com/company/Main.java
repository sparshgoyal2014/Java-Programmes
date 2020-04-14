package com.company;

public class Main {

    public static void main(String[] args) {

        char cValue = 'D';  // Note: Char occupies 2 Bytes of memory (or 16 bits)

        int cNumber = cValue;
        System.out.println(cNumber);

         /*****  UNICODE  *****/

         char unicodeChar = '\u0044';
        System.out.println(cValue);
        System.out.println(unicodeChar);

        char unicodeChar2 = '\u00BF';
        System.out.println(unicodeChar2);


        /** boolean ***/
        boolean trueValue  = true;
        boolean falseValue = false;
        boolean isCustomerOverTwentyOne = true;   // It is a Practical Application of Boolen Values
    }


}

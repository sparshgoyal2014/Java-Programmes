package com.company;

public class Main {

    public static void main(String[] args) {
        /****
         * Primitive Types:-
         * byte, short,int, long, float, Double, char, boolean
         */

        /***  String ***/

        // Note: String is not a primitive data type, It is actually a class

        String sValue = "Thi is a String";
        System.out.println("sValue = " + sValue);
        System.out.println(sValue.hashCode());

        sValue = sValue + " and this is more. ";
        System.out.println("sValue = " + sValue);
        System.out.println(sValue.hashCode());

        sValue = sValue + "\u00A9 2019";
        System.out.println("sValue = " + sValue);



        /*** TEST ****/
        String name = "Saching";
        name.concat("Tendulkar");

        StringBuilder name2 = new StringBuilder("Sachin") ;
        name2.append("Tendulkar");

        /************/

        String lastString = "20";
        int myInt = 20;
        lastString = lastString + myInt;
        System.out.println("Last String = " + lastString);

        double dValue = 2.3;
        lastString = lastString + dValue;
        System.out.println(lastString);
        System.out.println(Double.toString(dValue));

        // Note: Strings are immutable in java



    }
}

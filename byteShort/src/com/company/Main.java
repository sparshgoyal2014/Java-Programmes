package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte maxBytevalue = Byte.MAX_VALUE;
        byte minBytevalue = Byte.MIN_VALUE;

        System.out.println("Byte Max value " +  maxBytevalue);
        System.out.println("Byte Min value " +  minBytevalue);

        short maxShortValue = Short.MAX_VALUE;
        short minShortvalue = Short.MIN_VALUE;

        System.out.println("Short Max value " +  maxShortValue);
        System.out.println("Short Min value " +  minShortvalue);

        long longVAlue = 100;
        Long maxLongvalue = Long.MAX_VALUE;
        Long minLongvalue = Long.MIN_VALUE;

        System.out.println("Long Max value " +  maxLongvalue);
        System.out.println("Long Min value " +  minLongvalue);

//        long BigLongVAlue = 2147483647897;  // error: Integer  Number Too Large
//        long BigLongVAlue = 2147483647897L;  // no error: because 'L' is used

        /*
        Note: Default Whole Number in Java is An int Integer not any other data types lioke; long , short, byte etc;
         */

        long testNumber = 12131643L;
        int testintNumber = (int)testNumber;  // shortning/

        /*
        for conversion from higher data types to lower data types:  we must do type conversion Manually
         */

        int testIntNumber2 = 53124;
        long testLongNumber2 = testIntNumber2;  // widening

        /*
        for conversion from lower data type to higher data type: the JVM do the conversion Automatically
        In that case it is non as automated type conversion
         */

        /*******ARITHEMATIC********/

        double total = (double)5/2;
        System.out.println(total);

        int testDnumber = (int)2.4;
        System.out.println(testDnumber);

        System.out.println((int)5.6);

//        byte newBValue = (minBytevalue/2);  // error: Because byDefault in java, a whole number is of int data type and here it is shortening so
        // we must have to type cast it manually
        byte newBValue = (byte)(minBytevalue/2);
        System.out.println(newBValue);

        short newSValue = (short)(minShortvalue/2);
        System.out.println(newSValue);



    }
}

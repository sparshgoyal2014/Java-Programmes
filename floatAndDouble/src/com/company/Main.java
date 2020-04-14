package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         /*****
         Note:
         Float is a single precision number
         and Double is a double precision number
          *****/

         float minFNumber = Float.MIN_VALUE;
        System.out.println("Float minimum value = " + minFNumber);

        float maxfNumber = Float.MAX_VALUE;
        System.out.println("Float Maximum Value = " + maxfNumber);

        double minDNumber = Double.MIN_VALUE;
        System.out.println("Double minimum value = " + minDNumber);

        double maxDNumber = Double.MAX_VALUE;
        System.out.println("Double Maximum Value = " + maxDNumber);


        int iValue = 5/2;  // Note: It does not handle the remainder of the devision
//        float fValue =  5.25;  // Error: Because Double is assumed to Be default floating point Number
        float fValue =  ((float)  5.25) / 2;
        double dValue = 5d / 3d;  // there is no need to mention as 'd', we can simply use 5.00/3.00  it will automatically assume as double value
        float fValue2 = 5f / 3f;

        System.out.println("Integer value " + iValue);
        System.out.println(fValue);
        System.out.println("Double Value " + dValue);
        System.out.println("Floating point value " + fValue2);

        /**** Challenge ****/

        double numberOfPounds = 200d;
        double convertedKillograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted killogams " + convertedKillograms);

        double pi = 3.1415927d;

        System.out.println(Math.PI);

        


    }
}

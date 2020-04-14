package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] sArray = new String[10];
        int[] iArray = new int[10];

        ArrayList<String> sArrayList = new ArrayList<>();

        Integer integer = new Integer(10);
        Double dvalue = new Double(1.2);

        ArrayList<Integer> iArrayList = new ArrayList<>();
        for(int i=0; i<10; i++){
            iArrayList.add(Integer.valueOf(i));  // here we are converting int(base primitive value) to the Integr class and this is called 'AutoBoxing'
        }

        for(int i=0; i<10; i++){
            System.out.println(i + " ---> " + iArrayList.get(i).intValue());  // Unboxing // object wrapper tyo the primitive type
        }

        Integer iValue = 56;

//        Double dValue = 1;  // error // because casting and autoBoxing are two different things

        Integer iValue2 = 45;  // Integer.valueof(45)  // This is done at compile time
        int myIntvalue = iValue2; // myIntValue.intValue()
    }
}

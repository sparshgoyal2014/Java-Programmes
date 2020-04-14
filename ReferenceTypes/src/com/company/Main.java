package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int iValue = 10;
        int anotherIValue = iValue;

        System.out.println("iValue = " + iValue);
        System.out.println("anotheriValue = " + anotherIValue);

        anotherIValue++;

        System.out.println("iValue = " + iValue);
        System.out.println("anotheriValue = " + anotherIValue);

        int[] iArray = new int[5]; // iArray is reference  //

        /****
         * Note: a reference holds the reference (address) of an object but not the object itself
         */

        int[] anotherArray = iArray; // anotherArray and iArray holds the same refernce in the address

        /****
         * Note: There is only one copy of array present in the memory.
         */
        System.out.println("iArray = " + Arrays.toString(iArray));
        System.out.println("Another array = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change, iArray = " + Arrays.toString(iArray));
        System.out.println("After change, Another array = " + Arrays.toString(anotherArray));

//        anotherArray = new int[]{4,5,6,7,8};  // de-referencing
        modifyArray(iArray); // now we got three references to the array, (parwametere also referencing to the array)

        System.out.println("After modify, iArray = " + Arrays.toString(iArray));
        System.out.println("After modiy, Another array = " + Arrays.toString(anotherArray));

        modifyArray(iArray);


        System.out.println("After modify, iArray = " + Arrays.toString(iArray));
        System.out.println("After modiy, Another array = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5};
    }
}

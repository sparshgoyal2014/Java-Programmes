package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 1;

        if(value == 1) {
            System.out.println("value is one");
        }else if(value == 2){
            System.out.println("value is Two");
        }else{
            System.out.println("valie is not 1 or 2 ");
        }

        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("VAlue is 1");


            case 2:
                System.out.println("value is 2");


            case 3:
                System.out.println("VAlue is 3");
                break;

            case 4: case 5: case 6:
                System.out.println("VAlue is 4 or 5 or 6");
                System.out.println("Actually it was a " + switchValue);
                break;



            default:
                System.out.println("Value is other than 1, 2, or 3");
                break;
        }


        /*
        Note: If we don't use break; keyword we will get unpredictable results.
         */
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte bValue = 10;
        short sValue = 20;
        int iValue = 50;

        long lTotal = 50000L + 10L * (bValue + sValue + iValue);
        System.out.println(lTotal);
    }
}

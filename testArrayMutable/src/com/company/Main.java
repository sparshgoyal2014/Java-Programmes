package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<ArrayList<Integer>> arrayOfArray = new ArrayList<>();

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);


        ArrayList<Integer> integerArrayList2 = new ArrayList<>();
        integerArrayList2.add(4);
        integerArrayList2.add(5);
        integerArrayList2.add(6);


        ArrayList<Integer> integerArrayList3 = new ArrayList<>();
        integerArrayList3.add(7);
        integerArrayList3.add(8);
        integerArrayList3.add(9);


        arrayOfArray.add(integerArrayList);
        arrayOfArray.add(integerArrayList2);
        arrayOfArray.add(integerArrayList3);

        ArrayList<ArrayList<Integer>> arrayOfArray2 = new ArrayList<>(arrayOfArray);

        arrayOfArray2.get(0).add(111);

        System.out.println((arrayOfArray.get(0)).get(3));
        System.out.println((arrayOfArray2.get(0)).get(3));
    }
}

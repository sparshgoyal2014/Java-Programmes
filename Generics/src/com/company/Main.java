package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add("sparstsh");

//        printDoubled(items);
        printAsItIs(items);


        ArrayList<Integer> iList = new ArrayList(); // WARNING: Unchecked Assignment


        iList.add(5);
        iList.add(6);
        iList.add(7);
        iList.add(8);
        printList(iList);

    }

    private static void printDoubled(ArrayList n){  // Due to Backwards compatibility it (without specifying parameter in the diamonds operator) is still valid
        for(Object i: n){
            System.out.println((Integer) i*2);  // we will get ClassCastException
        }
    }

    private static void printList(ArrayList<Integer> list){
        for (Integer i: list){
            System.out.println(i*2);
        }
    }

    private static void printAsItIs(ArrayList list){
        for(Object i : list){
            System.out.println(i);
        }
    }
}

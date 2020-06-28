package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static <T> void test(T[] arr){
        arr[0] = (T)(Integer)5;

    }

    public static void main(String[] args) {
	// write your code here
        double[] arrayOfdoubles = {1.2, 2.4, 5.6, 8.7, 4.1};

//        for(int i : arrayOfdoubles){}  // Okay, compile time checking

        ArrayList arrayList = new ArrayList();

        ArrayList<Integer> arrayList1 = arrayList;
        arrayList.add(1);
        arrayList.add(2.3);
        arrayList.add('a');

        for(Integer i: arrayList1){

            System.out.println(i);

        }

    }
}

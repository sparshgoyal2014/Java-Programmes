package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//
//        ArrayList<Integer> list2 = list;
//
//        for(int i : list){
//            System.out.print(i);
//            System.out.print(" ");
//        }
//
//        System.out.println();
//
//        for(int i : list2){
//            System.out.print(i);
//            System.out.print(" ");
//
//        }
//
//        list2.add(3);
//        System.out.println();
//
//        for(int i : list){
//            System.out.print(i);
//            System.out.print(" ");
//        }
//
//        System.out.println();
//
//        for(int i : list2){
//            System.out.print(i);
//            System.out.print(" ");
//
//        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<Integer> list2 = new ArrayList<>(list);

        list.add(3);
        System.out.println(list2.get(1));


    }
}



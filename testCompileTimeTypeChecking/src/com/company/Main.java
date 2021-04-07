package com.company;

import javax.management.ObjectName;
import java.awt.event.TextEvent;
import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> void testWildCard (ArrayList<?> x){
        System.out.println(x);
    }

    public static Object test(){
        return 5;
    }

    public static void main(String[] args) {

//
//        List list = new ArrayList<Integer>();
//
//        List<String> list1 = list;
//
//        List list2 = list1;
//
//
//        ArrayList<Integer> arrayList = new ArrayList();
//
//        ArrayList<String >arrayList = new ArrayList<>();
//
//        arrayList.add;

        MyNode mn = new MyNode(5);
        Node n = (MyNode)mn;            // A raw type - compiler throws an unchecked warning
        n.setData("hello");
//        Integer x = (mn.data);

//        Node<String> node = mn;

//
//        Node<String> node = new Node<>("hello");
//
//        node.setData(2);


//        System.out.println((String) test());
//
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        Object object = arrayList;
//
////        (Integer)object
//
//        Object object1 = new Object();
//        (Integer)object

        testWildCard(3);
        testWildCard(? extends Number);


        List<Object> list = new ArrayList<Object>();

        ArrayList<?> arrayList = new ArrayList<Integer>();





    }
}

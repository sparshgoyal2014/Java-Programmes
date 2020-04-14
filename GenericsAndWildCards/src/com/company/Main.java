package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Animal<Integer> animal = new Animal<>();
	    animal.display(5);

//	    public int name = 5;  // keyword public not allowd here

	    Bird bird = new Bird();
	    bird.display(new Animal<String>());
	    bird.display(new Animal<Integer>());

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1.2);
        arrayList.add("HelloWorld");

//        for(Integer i : arrayList){   // error
//            System.out.println(i);
//        }

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);

        for(Object o : arrayList2){
            System.out.println(o);
        }

        Collection<?> collection = new ArrayList<>();
        collection.add(1);

        ArrayList<?> arrayList3 = new ArrayList<>();
        arrayList3.add(1);

        List<?> arrayList4  = Arrays.asList(1,2,4);


    }
}

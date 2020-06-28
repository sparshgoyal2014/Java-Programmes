package com.company;

import javax.naming.BinaryRefAddr;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//
//        ArrayList<? extends Number> arrayList2 = arrayList;
//        arrayList2.add(2.3);

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);


        List< ? extends Number> anyNumbers = integers;

        List<Number> numbers = (List<Number>) anyNumbers;

        numbers.add(3.5);

        System.out.println("Programme Finished!");
        System.out.println(numbers.get(4));

        ArrayList arrayList = new ArrayList<String>();
        arrayList.add(10);

        ArrayList arrayList2 = new ArrayList();

        new ArrayList().add(5);
        new ArrayList<Integer>().add(5);                                        // anonymous objects are temporary objects they are created and destroyed at the end of the statement

//        List<Integer> list = new ArrayList<String>(); // compile-time error  // acc. to me it is know as type checking at compile time
        Animal animal = new Dog();
        Dog dog = (Dog) new Animal();  // exception will be thrown during run time

        Animal animal2 = new Animal();

        ((Dog)animal2).toString();  // compiler is not aware of error it iis going to produce he is just giving warnings.


        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(5);
        arrayList3.add(3.2);
        arrayList3.add(new Animal());

        ArrayList<String> arrayList4 = arrayList3;



     }
}

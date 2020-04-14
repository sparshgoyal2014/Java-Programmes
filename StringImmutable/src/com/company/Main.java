package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = new String("String one");
        String name2 = name;

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());

        name2 = "String two";

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());


        //////////////////////////////////////////////
        System.out.println("****************************");

        StringBuilder str1 = new StringBuilder("Sachin");
//        str1 = str1 + new StringBuilder("fsf");
        System.out.println(str1.hashCode());
        str1 = new StringBuilder("Schin tendulkar");

        System.out.println(str1);
        System.out.println(str1.hashCode());

        str1.append("12334");
        System.out.println(str1);
        System.out.println(str1.hashCode());

    }
}

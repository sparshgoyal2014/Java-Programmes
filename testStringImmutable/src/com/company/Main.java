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


    }
}

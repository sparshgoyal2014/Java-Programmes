package com.company;

class Animal{
    public int display(){
        System.out.println("This is display method");
        return 5;
    }
}


public class Main {

    public static int a(){
        System.out.println("This is a");
        return 1;
    }

    public static int b(){
        System.out.println("This is b");
        return 2;
    }

    public static int c(){
        System.out.println("This is c");
        return 3;
    }

    public static void main(String[] args) {
	// write your code here
//        int i = 3;
//        int j = i * (i + 2);
//
//        System.out.println(j);
//
//
//        int z = a() + b() * c();
//
//        System.out.println(z);
//
//
//        Animal animal = new Animal();
//
//        int x = animal.display() + a();
//
        int i = 3;
        int y = i * 3 + (i = 2);

        y = (i = 2) + i*3;
        System.out.println(y);
    }
}

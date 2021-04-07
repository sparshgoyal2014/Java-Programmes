package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Animal(){
            @Override
            public void display() {
                System.out.println("This is Anonymous Class");
            }

            public void test(){
                System.out.println("This is test Method of anonymous Class");
            }
        }.test();





    }
}

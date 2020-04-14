package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal() {
            @Override
            public void display() {
                System.out.println("This is Anonymous Class");
            }

            public void testMethod(){
                System.out.println("This is test Method of Anopnymous Inner class");
            }
        };

        Dog dog = new Dog(3){
            @Override
            public void display() {
                System.out.println("This is ? Class");
            }

            public void testMethod(){
                System.out.println("This is Test Method");
            }
        };

        dog.display();


    }
}

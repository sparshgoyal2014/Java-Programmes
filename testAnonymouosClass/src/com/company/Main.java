package com.company;

import java.nio.channels.spi.AbstractInterruptibleChannel;

public class Main {



    public static void main(String[] args) {

        static int x = 4;
	// write your code here
        Animal animal = new Animal(5){
            @Override
            public void display() {
                System.out.println("This is Anonymous Class display method");
            }

            public void test(){
                System.out.println("This is Test method of Anonymous Class");
            }

        };

        System.out.println(animal.name);

        Animal animal1 = new Animal(3){
//            static int x = 5;
        };

        System.out.println(Dog.Inner.number);
    }
}

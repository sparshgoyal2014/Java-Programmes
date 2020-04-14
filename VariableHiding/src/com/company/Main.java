package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal();
        System.out.println(animal.name);

        Dog dog = new Dog();
        System.out.println(dog.name);

        System.out.println("*********************************");
        dog.modifyFields();



    }

    public static void foo()
    {
        int x = 3 ;

        {  // Open brace starts block
            boolean x = true ;

            // Prints "x is true"
            System.out.println( "x is " + x ) ;
        } // End of block. y is out of scope

        // Prints "x is 3"
        System.out.println( "x is " + x ) ;
    }
}

package com.company;

class Dog{
    public static String name;

    public Dog(String name){
        this.name = name;
    }

    public void display(){
        System.out.println(Dog.name);
    }

    public static void testStaticMethod(){
//        this.name = "abc"  // we can not use this inside static methods
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        /***
         *
         * Note:
         * 1. Static methods are declared using static modifier
         * 2. Static methods can't access instance methods and instance variables directly.
         * 3. They are used for operations that don't require any data from an instance of the class(from 'this')
         * 4. If you remember, the this keyword is the current instance of a class.
         * 5. so, In static methods we can,t use the this keyword.(We don't have access to the this keyword)
         * 6. Whenever you see a method that does not use instance variables that should be declared as static method.
         * 7. for example, main is a static method and it is called by the JVM when it starts an appliocation
         */
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Thread thread = new Thread(){

            public String name = "Anonymous Class";

            public void display(){
                System.out.println("This is anonymous class displpay method");
            }
        };


        Thread thread1 = new Thread();

        String string = new String();


        Bird bird = new Bird("Hello"){
            public void display(){
                System.out.println("This is display method of Anonymous Bird Class");
            }
        };

        bird.display();





    }
}

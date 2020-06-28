package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal(){
            @Override
            public void display() {
                System.out.println("This is anonymous class");
            }
        };

        animal.display();

        Animal animal1 = new Animal();
    }

}

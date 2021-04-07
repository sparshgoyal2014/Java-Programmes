package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Animal("hello Animal"){
            @Override
            public void display() {
                System.out.println("This is Annonymous inner class made with Animal Class");
                System.out.println(name);

            }
        };

        animal.display();

    }
}

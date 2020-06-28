package com.company;

class Animal{
    public void display(){
        System.out.println("This is display method of Animal Class");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(new Animal());
        Object object = new Animal();

        ((Animal)object).display();

        ((Animal)object).display();
    }
}

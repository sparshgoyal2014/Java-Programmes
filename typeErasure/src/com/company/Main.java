package com.company;

class Bird{
    public String name = "BirdClass";

    public void display(){
        System.out.println("this is display method of Bird Class");
    }
}

class Dog{
    public String name = "DogClass";

    public void display(){
        System.out.println("this is display method of Dog Class");
    }
}


class Animal<T>{
    T test = (T)new Bird();


}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal<Dog> animal = new Animal<>();
//        System.out.println((Bird)animal.test);  // okay, compile time checking...
        System.out.println(animal.test.getClass().getName());

        Object object = new Bird();

//        System.out.println((Dog)(Bird)object);
    }
}

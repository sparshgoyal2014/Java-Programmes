package com.company;

class Animal{

//    public Animal(){
//        System.out.println("This is Animal Class constructor");
//    }
//
     public Animal(int name){
         System.out.println("This is parameterized Animal Class constructor");
     }
    public void eat(){
        System.out.println("All animals eat");
    }
}

class Dog extends Animal{
//    public Dog() {
//        super();
//        System.out.println("hgchxfhxfhsx");
//    }

    //    public Dog(){
//        System.out.println("This is dog class constructor....");
//    }
    public void bark(){
        System.out.println("All Dogs bark");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Dog();
//        (animal).bark();
//        Object obj = new Animal();

//        Dog dog = (Dog)new Animal();
//        dog.bark();
    }
}

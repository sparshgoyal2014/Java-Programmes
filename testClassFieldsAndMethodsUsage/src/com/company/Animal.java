package com.company;

public class Animal {
    public String name = "AnimalClass";

//    public String name2 = name3;
    public String name4 = this.name3;
    public String name3 = "Animal Class name3";
    public String name5 = this.name3;

//    public Animal animal = animal.getReference();
//    public Dog dog = dog.getReference();

    public void display(){
        System.out.println("This is display method of Animal Class");
        test();
    }

    public void test(){
        System.out.println("This is test method of Animal Class");
        display();
    }

    public Animal getReference(){
        return new Animal();
    }
}


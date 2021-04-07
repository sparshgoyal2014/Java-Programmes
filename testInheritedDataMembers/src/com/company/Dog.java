package com.company;

public class Dog extends Animal {
    public String breed;

    Dog(){
        this.name = "Dog Class";

    }

    Dog(String breed){
        this.breed = breed;
    }


    public void display(){
        System.out.println("This is display method of Dog Class");
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

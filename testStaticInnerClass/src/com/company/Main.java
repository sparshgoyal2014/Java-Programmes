package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal.InnerTOAnimal.display();


        Animal animal = new Animal();

        animal.display();;


        Animal.InnerTOAnimal innerTOAnimal = new Animal.InnerTOAnimal();

        System.out.println(innerTOAnimal.number);


    }
}

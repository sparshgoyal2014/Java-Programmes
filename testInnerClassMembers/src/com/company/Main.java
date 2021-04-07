package com.company;

public class Main {

    public class Animal{
        private String name = "Animal Class";

        private void display(){
            System.out.println("This is display method of Inner Class");
        }

        public Animal(){
            System.out.println("THis is Animal Inner Class");
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main.Animal animal = new Main().new Animal();
        System.out.println(animal.name);

        System.out.println(animal.name);


        Vehicle.Gear gear = new Vehicle.Gear();
        System.out.println(gear.name);


    }
}

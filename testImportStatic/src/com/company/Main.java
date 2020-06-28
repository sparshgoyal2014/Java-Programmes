package com.company;

import com.example.*;

import static com.company.Animal.name;
import static com.company.Animal.number;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Animal.name);
        System.out.println(name);
        System.out.println(number);

        Animal animal = new Animal();

        com.example.Vehicle.Gears gears = new Vehicle.Gears();

    }
}

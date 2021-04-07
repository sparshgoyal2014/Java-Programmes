package com.company;

public class Vehicle {
    public Vehicle(){
        System.out.println("This is Vehicle Class");
    }

    public static class Gear{

        private String name = "Gear Inner class";

        private void display(){
            System.out.println("THis is display method of Gear inner class");
        }

        Gear(){
            System.out.println("This is Gear Class");
        }
    }
}

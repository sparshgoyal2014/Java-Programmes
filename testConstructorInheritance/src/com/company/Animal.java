package com.company;

public class Animal {
    Animal(){
        System.out.println("This is Default constructor of Animal Class");
    }

    Animal(int number){
        System.out.println("This is parameterized constructor of animal class with single parameter: " + number);
    }

    Animal(int number1, int number2){
        System.out.println("This is parameterized constructor of animal class with two parameters: " + number1 + " and " + number2);

    }

    public void display(){
        System.out.println("This is display method in Animal class");
    }

    public class Inner{
        public void display(){
            System.out.println("This is display method of Inner class to the Animal Class");
        }
    }

    public void testMethod(){
        new Animal.Inner().display();
        new Animal().new Inner().display();
        Animal.this.display();
        Inner.this.display();
        this.display();
        new Animal.Inner();
        new com.company.Inner();
    }
}

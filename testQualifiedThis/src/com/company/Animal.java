package com.company;

public class Animal {

    public String name = "Animal Class";
    public void display(){
        System.out.println("This is Animal Class");
        System.out.println(name);
        System.out.println(number);
    }

    public void testQualifiedThis(){
        this.display();
        display();
        Animal.this.display();
    }


    public static class Dog{
        public void display(){
            System.out.println("This is Inner Dog Class");
        }

        public void testThis(){
            this.display();
//            Animal.this.display();
        }

    }

    public int number = 5;
}

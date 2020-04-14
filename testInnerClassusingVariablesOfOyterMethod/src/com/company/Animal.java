package com.company;

public class Animal {
    public String name = "AnimalClass";

    public void display(){
        System.out.println("This is Display method of Animal class");
    }

    public class Dog{
        public String name = "Dog";

        public void display(){
            System.out.println("This is Dog class Inner to that of Animal class");
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Animal.this.name);
        }


        public void testLocalClass(){
            int number = 5;

            class Local{
                public int number2 = 4;

                public void display(){
                    System.out.println("This is Local Class to that of testLocalClassMethod of Animal Class");
                    System.out.println(number);
                }
            }
        }

    }
}

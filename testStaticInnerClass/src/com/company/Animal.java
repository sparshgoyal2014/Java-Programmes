package com.company;

public class Animal {

    public String name = "Animal Class";

    public void display(){
        System.out.println("This is Animal Class's display method");
        System.out.println(new InnerTOAnimal().nameInner);

        System.out.println(new InnerTOAnimal().number);


    }

    public static  class InnerTOAnimal{
        public String nameInner = "Inner To Animal Class";
        private int number = 5;

        public static void display(){
//            System.out.println(name);
            System.out.println("This is display method of Inner class");
        }


    }


}

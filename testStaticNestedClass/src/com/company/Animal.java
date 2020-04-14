package com.company;

public class Animal {
    private String name;

    public static class Dog{
        public void display(){
            System.out.println("This is static dog class nested into the Animal Class");
        }
    }
}

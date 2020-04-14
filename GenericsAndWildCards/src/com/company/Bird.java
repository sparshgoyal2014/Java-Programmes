package com.company;

public class Bird {
    public void display(Animal<?> animal){
        System.out.println(animal.name);
    }

    public <E>void display2(Animal<E> animal){
        System.out.println(animal.name);
    }
}

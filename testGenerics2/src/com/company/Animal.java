package com.company;

public class Animal<T> {
    T data;

    Vehicle<T> vehicle = new Vehicle<>();
    Vehicle<?> vehicle2 = new Vehicle<>();
    public Animal(T data){
        this.data = data;
    }

    public void display(){
        System.out.println("This class data is: " + this.data);
    }
}

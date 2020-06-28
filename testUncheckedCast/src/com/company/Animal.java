package com.company;

public class Animal<T> {
    T test = (T)new Bird();


    public void display(){
        System.out.println(((T)new Bird()));
    }

    public T getObject(){
        return (T)new Bird();
    }
}

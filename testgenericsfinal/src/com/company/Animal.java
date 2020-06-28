package com.company;

public class Animal<T> {

    T test = (T)new Bird();


    public void display(){
        System.out.println("This is display method of generic Animal Class");
    }

    public void displayWithType(T t){
        System.out.println("This is displayeith type method of generic Animal Class" + t);
    }

    public void displayWithLocalVar(){
        T localVar = (T)(Integer)4;
    }



}


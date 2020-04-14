package com.company;

public class Animal<T> {

    public String name = "Animal Class";
    public void display(T data){
        System.out.println(data);
    }
}

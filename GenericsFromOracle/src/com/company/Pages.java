package com.company;

public class Pages<T> {
    public T t;

    public void setT(T t) {
        this.t = t;
    }

    public void display(){
        System.out.println("This is display method of Pages Class");
    }
}

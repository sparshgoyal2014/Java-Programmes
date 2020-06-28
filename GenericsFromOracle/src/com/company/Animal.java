package com.company;

public class Animal<T> {
    public T t = (T)new Bird();
//    public T t2 = new Dog();

//    public Animal(T t){
////        this.t = t;
//        t = this.t;
//    }
    public void set() {
//        this.t = t;
        ((Dog)t).display();
    }
    public T get() { return t; }
}

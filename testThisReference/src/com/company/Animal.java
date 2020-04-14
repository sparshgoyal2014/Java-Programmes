package com.company;

public class Animal {
    public int number = 5;

    public void setNumber(int number){
        this.number= number;
    }

    public void display(){
        System.out.println("This is Animal Class");
        this.print();
    }

    public void displayNumber(){
        System.out.println(number);
        System.out.println(this.number);
    }

    public void print(){
        System.out.println("This is Animal Class Print Function");
    }
}

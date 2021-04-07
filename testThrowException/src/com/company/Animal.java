package com.company;

public class Animal {

    public void display(){
        try{
            throw new NullPointerException();
        }catch (Exception e){
            System.out.println("Don't worry!");
        }
    }
}

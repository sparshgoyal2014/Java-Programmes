package com.company;

public class Dog extends Animal {
    public String name;
    public void modifyFields(){
        this.name = "dog Class name changed";
       super.name = "Animal Class name Changed";
        System.out.println(name);
    }
}

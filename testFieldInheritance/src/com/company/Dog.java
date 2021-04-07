package com.company;

public class Dog extends Animal {

    public int number;

    public Dog(String name, int number){
        super(name);
        this.number = number;
    }

    public void display(){
        System.out.println(name);
        super.name = "new Name";
        System.out.println(name);


        System.out.println(Dog.this.name);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++==");
        this.name = "Classic dog";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }

}

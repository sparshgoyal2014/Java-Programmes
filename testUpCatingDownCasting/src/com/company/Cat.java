package com.company;

public class Cat extends Animal{
    public String name = "CatClass";
    private int number = 4;
    public double specialProperty = 1.2;

    @Override
    public int getNumber() {
        return number;
    }

    public void catProperty(){
        System.out.println("All Animals Can not Meow, but cat can Meow");
    }

    public void display(){
        System.out.println("This iS cat Class");
    }
}

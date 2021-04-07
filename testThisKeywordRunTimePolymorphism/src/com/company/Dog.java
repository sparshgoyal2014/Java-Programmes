package com.company;

public class Dog extends Animal {

    public String name = "Dog Class";

    @Override
    public void test() {
        System.out.println("This is test method of Dog Class");
    }

    @Override
    public void testField(){
        System.out.println(this.name);
        System.out.println(name);
        System.out.println(super.name);

    }


}

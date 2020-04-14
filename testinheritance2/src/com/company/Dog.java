package com.company;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(int name) {
        super(name);
    }

    public void eat(){
        System.out.println("Dogs eating style is very beautiful");
    }

    public void bark(){
        System.out.println("All dogs bark....");
    }
}

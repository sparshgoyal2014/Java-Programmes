package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal a = new Animal();
        Animal b = new Cat();
        Cat c = new Cat();

        a.display();
        b.display();
        c.display();

        System.out.println("****************************");

        a.printName();
        b.printName();
        c.printName();

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");
        a.staticDisplay();
        b.staticDisplay();
        c.staticDisplay();

    }
}

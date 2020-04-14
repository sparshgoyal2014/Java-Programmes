package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("one");
        Animal animal2 = new Animal("Two");
        Animal animal3 = new Animal("Three");
        System.out.println(animal1.getInstanceNumber());
        System.out.println(animal2.getInstanceNumber());
        System.out.println(animal3.getInstanceNumber());

        System.out.println(Math.PI);
//        Math math = new Math();

        int password = 123456789;
        Password password1 = new Password(password);
        password1.storePassword();
        password1.letMeIn(password);
        password1.letMeIn(789456123);

    }
}

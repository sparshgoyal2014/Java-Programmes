package com.company;

public class Animal {
    Animal animal;
    static int number = 5;
    static Bird bird;

    static  int number2 = number;
    static Bird bird2 = new Bird(number);

    static Bird bird3 = new Bird(new Animal());
    Animal animal2 = this;

//    static Bird bird23 = new Bird(this);


    public void test(){
        static Bird bird2;
        bird = new Bird(this);
        bird = new Bird(number);
    }

}

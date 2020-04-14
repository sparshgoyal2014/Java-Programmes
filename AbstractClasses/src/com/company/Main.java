package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Scooby");
        dog.eat();
        dog.breathe();

//        Bird bird = new Bird("Parrot");  // you can' directly instantiate the class that is abstract anyway/

        Bird bird = new Parrot("Parrot");
        bird.eat();
        bird.breathe();
        bird.fly();

        Penguin penguin = new Penguin("Empera");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}

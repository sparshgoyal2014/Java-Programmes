package com.company;

class First{
    public First(){
        heist();
    }

    public void heist(){
        System.out.println("This is heist method of First Class");
    }

    public void fun(){
        heist();
    }
}

class Second extends First{
    @Override
    public void heist() {
        System.out.println("This is heist method of Second class");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Second second = new Second();

        second.fun();


        First first = new First();

        first.fun();


        First first1 = new Second();
        first1.fun();


    }
}

package com.company;



public class Main {

    int N = 1000;

    public static void recur(int n){
        if(n <= 0){
            return ;
        }

        for(int i=0; i<1000; i++){

                recur(n-1);
                recur(n-1);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal();
        Animal animal1 = new Animal();

        System.out.println(animal.hashCode());
        System.out.println(animal1.hashCode());

        recur(3);


    }
}

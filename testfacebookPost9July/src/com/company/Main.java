package com.company;

class A{
    int i;

    public void display(){
        System.out.println(i);
    }
}


class B extends A{
    int j;

    public void display(){
        System.out.println(j);
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here

        B obj = new B();
        obj.i = 1;
        obj.j = 2;

        obj.display();

        A r;
        r = obj;

        r.display();;

    }
}

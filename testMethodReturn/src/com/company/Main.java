package com.company;


import java.io.ByteArrayInputStream;

class Foo{

    public String phleem;

    public void bar(){

    }

}

 class Bar{

    public String phleem;

}

public class Main {

    public static void main(String[] args) {
        Paper obj = new Book();
        obj.discription();
        new Book().discription();
        System.out.println(obj instanceof Book);


        Foo foo = new Foo();
        Bar bar = new Bar();
        Foo foo1 = (Bar)bar;


    }

    public static double display(){
        return 0.0;
    }




}

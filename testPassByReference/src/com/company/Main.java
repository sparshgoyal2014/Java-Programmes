package com.company;


class Test{
    public String name = "this is a Test String";
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Test t = new Test();
        System.out.println(t.name);
        test(t);
        System.out.println(t.name);

    }

    public static void test(Test t){
        t.name = "Another String";
        System.out.println(t.name);
    }
}

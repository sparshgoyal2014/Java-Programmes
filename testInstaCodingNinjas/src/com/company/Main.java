package com.company;

class Test{
    public static int number;
    public int testVar ;

    public void testMethod(){
        System.out.println(testVar);
    }
    void setNumber(int number){
        this.number = number;
        int localVar;
        System.out.println(localVar);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Test test = new Test();
//        test.setNumber(5);

        System.out.println(Test.number);
        System.out.println(test.testVar);
    }
}

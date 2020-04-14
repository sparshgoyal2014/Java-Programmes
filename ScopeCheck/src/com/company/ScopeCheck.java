package com.company;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck Created, public Var = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;
        for(int i=0; i<10; i++){
            System.out.println(i + " times two is: " + i*privateVar);  //variable shadowing(or maybe it is known as variable hiding)
        }
//        System.out.println("Value of i is now: " + i);
    }

    public void useinnerClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass{
        public int privateVar = 3;  // variable shadowing
        private int varThree = 30;  // its visibility extends to the outer class.


        public InnerClass() {
            System.out.println("InnerClass created, privateVar is: " + privateVar);
        }

        public void timesTwo(){
            int privateVar = 2;
            for(int i=0; i<10; i++){
                System.out.println(i + " times two is: " + i*ScopeCheck.this.privateVar);  // variables hiding
            }
//        System.out.println("Value of i is now: " + i);
        }
    }
}

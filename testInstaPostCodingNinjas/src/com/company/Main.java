package com.company;

class Student{
    static String name;
    int rollNum;

    Student(int n){
        rollNum = n;
    }

    void print(){
        System.out.println(rollNum + " " + name + " ");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student(56);
        student.name = "Shyam";
        student.print();
    }
}

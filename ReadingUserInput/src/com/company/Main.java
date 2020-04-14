package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Note: Scanner Class takes String from the console as a user input
        //      and Parse it into the corresponding form (like integer, Double, Float etc)
        //      using internal parse methods used by the Scanner Class

        System.out.println("Enter your year of Birth...");
        int yearOfBirth = scanner.nextInt(); // What actually happened here is, what user has typed here is automatically converted into the Integer internally via Parse methods anf gets stored into the yearOfBirth variable which is of type int
        scanner.nextLine(); // handles nextLine Character(Enter key)

        System.out.println("Enter your name...");
        String name = scanner.nextLine();

        int age = 2019 - yearOfBirth;

        System.out.println("Your name is " + name + " and your age is " + age + " years.");



        scanner.close();


//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println(scanner1.nextLine());



    }
}

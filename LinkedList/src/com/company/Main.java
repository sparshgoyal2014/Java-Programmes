package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;

        anotherCustomer.setBalance(12.16);

        System.out.println("Balance of customre " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,5);


        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

    }
}

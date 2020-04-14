package com.company;

import java.util.ArrayList;

public class Account {
    private String accountNumber;
    public int balance = 0;
    public ArrayList<Integer> transaction;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.transaction = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transaction.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now: " + this.balance);
        }else{
            System.out.println("Cannot Deposit negative sums");
        }
    }

    public void withdraw(int amount){
        int withdrawal = -amount;
        if(withdrawal < 0){
            this.transaction.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " is withdrawan. Balance is now: " + this.balance);
        }else{
            System.out.println("Cannot withdraw negative sums.");
        }
    }

    public void calculateBalance(){
        this.balance = 0;
        for(int i: this.transaction){
            this.balance += i;
        }
        System.out.println("Calculated balance is: " + this.balance);
    }
}

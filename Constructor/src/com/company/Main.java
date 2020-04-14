package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account account = new Account();  // This is default constructor constructed by java, it is a special method which is called when object is created
        account.setNumber("12345");
        account.setBalance(0.0);
        account.setCustomerEmailAddress("spatshgoyal20142gmail.com");
        account.setCustomerName("Spartsh goyal");
        account.setCustomerPhoneNumber("9306600245");
        account.withdrawal(100.0 );


        Account newAccount = new Account("spartsh goyal2", "sparshgoyal2014", "546687");
        System.out.println(newAccount.getNumber() + " name " + newAccount.getCustomerName());
    }
}

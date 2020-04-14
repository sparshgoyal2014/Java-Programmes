package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone phone = new DeskPhone(123456);
        phone.powerOn();
        phone.callPhone(123456);
        phone.answer();

        phone = new Mobilephone(2456789);
//        phone.powerOn();
        phone.callPhone(2456789);
        phone.answer();

    }
}

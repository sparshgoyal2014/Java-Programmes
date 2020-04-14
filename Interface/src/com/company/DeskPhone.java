package com.company;

public class DeskPhone implements ITelephone {
    private int number;
    private boolean isRinging;

    public DeskPhone(int number) {
        this.number = number;
    }

    @Override
    public void powerOn() {
        System.out.println("no action Taken, Desk Phone does not have power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing " + phoneNumber + " on desktop");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the deskPhone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == number){
            isRinging = true;
            System.out.println("Ring Ring!!");
        }else{
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

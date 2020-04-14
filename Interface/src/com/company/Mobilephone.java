package com.company;

public class Mobilephone implements ITelephone{
    private int number;
    private boolean isRinging;
    private boolean isOn = false;

    public Mobilephone(int number) {
        this.number = number;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("now ringing " + phoneNumber + " on mobilePhone");
        }else{
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobilePhone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == number && isOn){
            isRinging = true;
            System.out.println(" circuit Ringtone!!");
        }else{
            isRinging = false;
            System.out.println("mobile phone not on or number is Different.");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

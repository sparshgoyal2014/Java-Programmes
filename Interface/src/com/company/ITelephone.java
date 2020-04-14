package com.company;

public interface ITelephone {
    public String name = "Spartsh";
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();
}

package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Spartsh goyal";
        Car porche = new Car();  // Note: This is Initialization // we have to initialize these using new Keyword
        Car holden = new Car();
        porche.color = "ReD";

//        porche = null;   // we will get NullPointerException
        System.out.println(" model is " + porche.getModel());
        porche.setModel("Carrera");
        System.out.println(" model is " + porche.getModel());
    }
}

package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
//            throw new Exception("Hello");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}

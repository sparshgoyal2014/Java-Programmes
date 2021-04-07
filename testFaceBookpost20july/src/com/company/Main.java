package com.company;

public class Main {



    static void main(String[] args) {
	// write your code here
        int x, y = 1;
        x = 10;

        if(x != 10 && y/0 == 0){
            System.out.println(y);
        }else{
            System.out.println(++y);
        }
    }
}

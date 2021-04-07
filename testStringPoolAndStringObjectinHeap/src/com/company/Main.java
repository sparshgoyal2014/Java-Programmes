package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "Hello";
        String str2 = "Hello";

        if(str == str2){
            System.out.println("Yes they are equal");
        }else{
            System.out.println("not equal");
        }


        String str3 = new String("hi");
        String str4 = new String("hi");

        System.out.println(str3 == str4);



        str = "Hello" + "world";

        str2 = str2 + "world";

        String str5 = "Helloworld";


        System.out.println("Helloworld" == str5);





        if(str == "Helloworld"){
            System.out.println("yes again they are equal");
        }else{
            System.out.println("not equal :(");
        }

    }
}

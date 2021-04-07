package com.company;

public class Main {

    public static void main(String[] args) {

        int[][]arr = new int[3][3];


        arr[0] = new int[5];
        arr[1] = new int[10];

        arr[2] = new int[2];


        for(int i=0; i<3; i++){

            for(int j=0; j<arr[i].length; j++){

                arr[i][j] =  i*j;
            }

        }

        for(int[] x: arr){
            for(int y: x){

                System.out.print(y + " ");
            }
            System.out.println();
        }


        int[] arr2[] = new int[3][3];




    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[][] = {{1,2}, {3,4,5}};

        int[][] arr2 = new int[5][];

        arr2[0] = new int[2];
        arr2[0][0] = 1;
        arr2[0][1] = 2;


        for(int[] x: arr){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println(arr[1][2]);


//        int[] arrnull = new int[0];
//        arrnull[0] = 1;

        int [][] array2d = new int[3][3];

        System.out.println(array2d[0]);

        int oneDArray[] = {1,2,3,4,5};


    }



}

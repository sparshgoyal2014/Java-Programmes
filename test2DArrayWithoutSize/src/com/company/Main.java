package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] arr = new int[][]{{1,2,3}, {4,5,6}};

        for(int[] x: arr){
            for(int i: x){
                System.out.println(i);
            }
        }

        /*
         * Jagged Array
         */

        int[] arr2;


        int arr3[][] = new int[3][3];

        arr3[0] = new int[5];

        arr3[1] = new int[7];

        arr3[2] = new int[10];


        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length; j++){
                arr3[i][j] = j;

                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println();
        }


        int arr4[][][] = new int[3][][];

        arr4[0] = new int[5][];

        int[][] arr5 = new int[][]{{1,2,3},{4,5,6,7,8,9}};


        int[][] arr6 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};


        int[] arr7 = new int[5]{1,2,3,4,5};
        






    }
}

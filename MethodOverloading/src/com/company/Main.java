package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Spartsh", 200);
//        System.out.println(calculateScore("newName", 5655));
        System.out.println("New Score is " + newScore);

        calculateScore(54);
        calculateScore();

    }

    public static int calculateScore(String name, int score){
        System.out.println("player " + name + " scored " + score + " points.");
        return score+1000;
    }

    public static int calculateScore( int score ){
        System.out.println("unnamed player scored " + score + " points.");
        return score+1000;
    }

    public static int calculateScore(){
        System.out.println("No Player name, And no player score.");
        return 0;
    }

//    public static void calculateScore(){
//        System.out.println("No Player name, And no player score.");
//    }



    /*
    // Note: Changing the return type does not change the overall Signature.
     */







}

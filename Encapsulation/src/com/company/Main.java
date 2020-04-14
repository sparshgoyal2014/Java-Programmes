package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        player.name = "spartsh";
        player.health = 50;
        player.weapon = "AKM";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

    }
}

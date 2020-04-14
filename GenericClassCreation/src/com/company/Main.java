package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here

        /***
         * Note: You can also use Interface instead of abstract class as a Type Argument.
         */
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team<SoccerPlayer> india = new Team<>("INDIA");
//        india.addPlayer(joe);
//        india.addPlayer(pat);0
        india.addPlayer(messi);

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("chicago");
        baseballPlayerTeam.addPlayer(pat);

//        Team<String> stringTeam = new Team<>("The String Team");
//        stringTeam.addPlayer("No-One");   // ClassCastException



        System.out.println(india.numPlayers());
    }
}

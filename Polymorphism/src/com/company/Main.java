package com.company;
 class Movie{
    private String name;

     public Movie(String name) {
         this.name = name;
     }

     public String plot(){
         return "no plot here";
     }

     public String getName() {
         return name;
     }
 }

 class Jaws extends Movie{
        public Jaws(){
            super("jaws");
        }

        public String plot(){
            return "A shark eats lots of people";
        }
 }

 class IndepenceDay extends Movie{
     public IndepenceDay() {
         super("Independence day");
     }

     @Override
     public String plot() {
         return "Aliens attemp to tak over planet Earth";
     }

 }

 class MazeRunner extends Movie{
     public MazeRunner() {
         super("Maze Runner");
     }

     @Override
     public String plot() {
         return "kids try to escape a maze";
     }
 }

 class StarWars extends Movie{
     public StarWars() {
         super("Star wars");
     }

     @Override
     public String plot() {
         return "Imperial forces try to take over the universe";
     }
 }

 class Forgettable extends Movie{
     public Forgettable() {
         super("Forgettable");
     }

     // no plot Method
 }


public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Print movie #" + i + " : " + movie.getName()  + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("our random number = " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndepenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();

            default:
                return null;
        }

        // OR
        // return null;

    }
}


































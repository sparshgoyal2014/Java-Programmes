package com.company;

public class Animal {
    public String name;

    public int number ;

    public void display(){
        System.out.println("This is display method of Animal Class");
    }

    Animal(){
        this.name = "Animal Class";
    }

    public static class Inner{



        public static void testStaticMember(){

        }
        public void display(){
            System.out.println("This is display method of the inner class");
        }

        public void test(){
            Animal.this.display();
        }


        class Innertoinner{
            public void diosplay(){
                System.out.println("This is display method of innerToInner class");
            }

            public void test(){
                display();
                Inner.this.display();
                Animal.this.display();
                Inner.display();
            }
        }
    }

    public static   void testSetStatic(){
        number = 4;
    }
}

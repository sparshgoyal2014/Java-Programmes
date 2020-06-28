package com.company;


import static com.company.Test.NAME;
import static com.company.ThreadColor.*;

class Test{
    public static String NAME = "Test Class";
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(ANSI_PURPLE + "Hello, from the main Thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== another Thread ==") ;
        anotherThread.start();  // JVM calls run() method implicitly
        anotherThread.run();  // you shouldn't call this method directly , otherwise it will run on the same thread which calls it.



        new Thread(){
            public void run() {
                System.out.println(ANSI_GREEN + "Hello From the anonymous class Thread");
            }
        }.start();

        new Thread(){
            public void run(){
                System.out.println("Hello, From other Anonymous Thread class");
            }
        }.start();

//        Thread myRunnableThread = new Thread(new MyRunnable());
//        myRunnableThread.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_BLACK + "Hello, from Anonymous class implementation run of MyRunnable class");
            }
        });

        myRunnableThread.start();

        Thread myRunnableThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, from anonymous Run implementation of Runnable interface.");
            }
        });
        myRunnableThread2.start();

        System.out.println(ANSI_CYAN + "Hello, again from the main thread");
//        anotherThread.start();  // we can only call start once else we get the exception
//        System.out.println(Test.name);
        System.out.println(NAME);


    }
}

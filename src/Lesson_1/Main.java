package Lesson_1;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        RunnableClass test2 = new RunnableClass();
        Thread thread = new Thread(test2);
        thread.start();


        Threadclass test = new Threadclass();
        test.start();


        System.out.println("main finished");
    }
}

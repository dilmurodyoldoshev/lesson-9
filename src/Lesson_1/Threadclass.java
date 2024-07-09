package Lesson_1;

import java.util.concurrent.TimeUnit;

public class Threadclass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.println("test " + i);
        }
        System.out.println("task finished");
    }
}

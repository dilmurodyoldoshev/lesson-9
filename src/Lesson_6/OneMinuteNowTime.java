package Lesson_6;

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class OneMinuteNowTime {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            LocalDateTime currentTime = LocalDateTime.now();
            System.out.println(currentTime);
            sleep(60000);
        }
    }
}

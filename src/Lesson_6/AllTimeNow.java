package Lesson_6;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class AllTimeNow {
    static long currentTimeMillis = System.currentTimeMillis();
    static LocalDateTime currentDateTime = LocalDateTime.now();
    static ZonedDateTime currentZonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        System.out.println(currentTimeMillis);
        System.out.println(currentDateTime);
        System.out.println(currentZonedDateTime);
    }
}

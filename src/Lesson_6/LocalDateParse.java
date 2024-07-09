package Lesson_6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateParse {
    public static LocalDate parseLocalDate(String str) {
        LocalDate localParse = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return localParse;
    }

    public static void main(String[] args) {
        String sanaStr = "26-07-2005";

        LocalDate sana = parseLocalDate(sanaStr);

        System.out.println(sana);
    }
}

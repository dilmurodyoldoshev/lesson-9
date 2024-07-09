package Lesson_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regax {
    public static void main(String[] args) {
        Scanner scannerstr = new Scanner(System.in);
        while (true) {
//            System.out.println("Email kiriting: ");
//            String email = scannerstr.nextLine();
//            System.out.println(checkerEmail(email));
//            System.out.println("Telefon raqam kiriting: ");
//            String phoneNumber = scannerstr.nextLine();
//            System.out.println(isValidPhoneNumber(phoneNumber));
//            System.out.println("Parol kiriting: ");
//            String password = scannerstr.nextLine();
//            System.out.println(isPassword(password));
//            System.out.println("Matn kiriting: ");
//            String text = scannerstr.nextLine();
//            System.out.println(splitToWords(text));
            System.out.println("Matn kiriting: ");
            String text = scannerstr.nextLine();
            System.out.println(countDigits(text));
        }
    }
    public static int countDigits(String text){
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        return count;
    }
    public static List<String> splitToWords(String text) {
        List<String> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b\\w+\\b").matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    private static boolean isPassword(String password) {
        return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,20}$",password);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches("(^\\+?\\d{1,3})(\\d{1,3})(\\d{3,4})(\\d{4}$)", phoneNumber);
    }
    public static boolean checkerEmail(String email) {
        return Pattern.matches("([^\\d])(\\w{2,})@(\\w{2,10})\\.(\\p{Lower}{2,6})$", email);
    }


}

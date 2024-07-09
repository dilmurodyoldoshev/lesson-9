package Lesson_7;

import java.io.File;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("enter text");
        String text = scanner.nextLine();
        File file = new File("C:\\");
        check(file, text.toLowerCase());

    }

    public static void check(File file, String text) {
        if (file != null) {
            if (file.getAbsolutePath().toLowerCase().contains(text))
                System.out.println(file.getAbsolutePath() + (file.isFile() ? " is file" : " is directory"));
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null)
                    for (File f : files) {
                        check(f, text);
                    }
            }
        }
    }


}

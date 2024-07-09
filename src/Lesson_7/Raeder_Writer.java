package Lesson_7;

import java.io.*;
import java.util.Scanner;

public class Raeder_Writer {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\User\\OneDrive\\Rasmlar\\Ekran rasmlari\\Skrinshot 2024-06-20 122252");
        System.out.println("enter string");
        String str = scanner.nextLine();
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(str.getBytes());
        outputStream.close();


    }
}

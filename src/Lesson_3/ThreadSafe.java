package Lesson_3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafe {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Olma");
        list.add("Banan");
        list.add("O'rik");

        for (String item : list) {
            System.out.println(item);
        }

        list.set(1, "Shaftoli");
        list.remove(0);

        for (String item : list) {
            System.out.println(item);
        }
    }
}

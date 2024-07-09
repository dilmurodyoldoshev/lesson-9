package Lesson_6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    private static List<Todo> todos = new ArrayList<>();

    public static void main(String[] args) {
        // Yangi task qo'shish
        addTodo("Uy ishlarini qilish", LocalDateTime.now().plusMinutes(1));
        addTodo("Darsga tayyorgarlik", LocalDateTime.now().plusMinutes(5));
        addTodo("Kitob o'qish", LocalDateTime.now().plusMinutes(10));

        // Barcha task-larni tekshirish
        checkTodos();
    }

    private static void addTodo(String title, LocalDateTime dueTime) {
        todos.add(new Todo(title, dueTime));
        System.out.println("Yangi task qo'shildi: " + title + ", Muddati: " + dueTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    private static void checkTodos() {
        LocalDateTime now = LocalDateTime.now();
        for (Todo todo : todos) {
            if (now.isAfter(todo.dueTime)) {
                System.out.println("***** Task vaqti yetib keldi: " + todo.title + " *****");
                todos.remove(todo);
            }
        }
    }

    private static class Todo {
        private String title;
        private LocalDateTime dueTime;

        public Todo(String title, LocalDateTime dueTime) {
            this.title = title;
            this.dueTime = dueTime;
        }
    }
}
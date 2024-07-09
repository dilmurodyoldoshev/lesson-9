package Lesson_6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Todo {
    private String title;
    private LocalDateTime dueTime;

    public Todo(){}

    public Todo(String title, LocalDateTime dueTime) {
        this.title = title;
        this.dueTime = dueTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDueTime(LocalDateTime dueTime) {
        this.dueTime = dueTime;
    }

    public LocalDateTime getDueTime() {
        return dueTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Todo{" +
                "title='" + title + '\'' +
                ", dueTime=" + dueTime.format(formatter) +
                '}';
    }
}

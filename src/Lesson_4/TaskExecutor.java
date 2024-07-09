package Lesson_4;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskExecutor {
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void executeRunnableTasks() {
        Runnable task1 = () -> System.out.println("Runnable task 1 executed.");
        Runnable task2 = () -> System.out.println("Runnable task 2 executed.");

        executor.execute(task1);
        executor.execute(task2);
    }

    public static void executeCallableTasks() {
        Callable<String> task1 = () -> "Callable task 1 result.";
        Callable<String> task2 = () -> "Callable task 2 result.";

        Future<String> future1 = executor.submit(task1);
        Future<String> future2 = executor.submit(task2);

        try {
            System.out.println(future1.get());
            System.out.println(future2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        executeRunnableTasks();
        executeCallableTasks();

        executor.shutdown();
    }
}
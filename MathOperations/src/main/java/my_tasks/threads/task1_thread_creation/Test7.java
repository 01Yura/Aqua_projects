package my_tasks.threads.task1_thread_creation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test7 {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Making TASK1");
            try {
                Thread.sleep(3000);
                System.out.println("Task1 so over");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Runnable task2 = () -> {
            System.out.println("Making TASK2");
            try {
                Thread.sleep(3000);
                System.out.println("Task2 so over");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Runnable task3 = () -> {
            System.out.println("Making TASK3");
            try {
                Thread.sleep(3000);
                System.out.println("Task3 so over");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.shutdown();
    }
}

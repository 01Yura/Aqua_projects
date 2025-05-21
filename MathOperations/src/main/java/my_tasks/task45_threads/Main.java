package my_tasks.task45_threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadExample threadExample = new ThreadExample();
        threadExample.start();

        Thread thread1 = new Thread(new ThreadExample2());
        thread1.start();


        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from " + Thread.currentThread().getName());
            }
        };

        Thread thread2 = new Thread(task);
        thread2.start();

        Runnable task2 = () -> {
            System.out.println("Hello from " + Thread.currentThread().getName());
        };

        Thread thread3 = new Thread(task2);
        thread3.start();


        ExecServiceExample task3 = new ExecServiceExample();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> a1 = executorService.submit(task3);
        Future<Integer> a2 = executorService.submit(task3);
        Future<Integer> a3 = executorService.submit(task3);
        Future<Integer> a4 = executorService.submit(task3);
        Future<Integer> a5 = executorService.submit(task3);
        executorService.shutdown();
        int a11 = a1.get();
        int a12 = a2.get();
        int a13 = a3.get();
        int a14 = a4.get();
        int a15 = a5.get();
        System.out.println();

        System.out.println(a11 + a12 + a13 + a14 + a15);


        new Thread(() -> {
            System.out.println("Hello from " + Thread.currentThread().getName());
        }).start();

    }
}

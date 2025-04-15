package my_tasks.threads.executor_service;

import java.util.Random;
import java.util.concurrent.*;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> task = () -> {
            System.out.println("Calculating DNA...");
            Thread.sleep(1000);
            return new Random().nextInt(10000, 10002);
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(task);
        int dna = future.get();
        executorService.shutdown();
        System.out.println(dna);
    }

}



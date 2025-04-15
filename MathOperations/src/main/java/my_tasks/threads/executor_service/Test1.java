package my_tasks.threads.executor_service;

import java.util.concurrent.*;

public class Test1 {
    static int factorialResult;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(5);
        Future<Integer> future = executorService.submit(factorial2);
        System.out.println(future.get());
        executorService.shutdown();
        
    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Number <=0 !");
        }

        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= i;
        }
        return result;
    }
}
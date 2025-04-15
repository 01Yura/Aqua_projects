package my_tasks.threads.task1_thread_creation;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        Thread makeCoffee = new Thread(() -> {
            System.out.println("Making coffee");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Coffee is ready");
        });

        Thread makeBreakfast = new Thread(() -> {
            System.out.println("Making breakfast");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Breakfast is ready");
        });

        Thread goWork = new Thread(() -> {
            System.out.println("Going to work");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Working");
        });

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(makeBreakfast);
        executorService.execute(makeCoffee);
        executorService.execute(goWork);
        executorService.shutdown();
    }
}

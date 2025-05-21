package my_tasks.task45_threads;

public class ThreadExample2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}

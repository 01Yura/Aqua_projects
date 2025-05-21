package my_tasks.task45_threads;

public class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}

package my_tasks.threads.task1_thread_creation;

public class Test5 {
    static int counter = 0;

    public static synchronized void increment() {
        Test5.counter++;
    }

    ;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                Test5.increment();
            }
        });

        Thread thread2 = new Thread(thread1);
        Thread thread3 = new Thread(thread1);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(Test5.counter);


    }
}

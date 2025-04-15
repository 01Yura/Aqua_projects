package my_tasks.threads.task1_thread_creation;

public class Test4_AnonimusClass {
    static long counter = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        Thread thread3 = new Thread(new R());

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Test4_AnonimusClass.counter);

    }
}

class R implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Test4_AnonimusClass.counter++;
        }
    }
}

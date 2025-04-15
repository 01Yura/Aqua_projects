package my_tasks.threads.task1_thread_creation;

public class Test2_ImplementsRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread3());
        Thread thread2 = new Thread(new Thread4());
        System.out.println(thread1.getName() + " " + thread1.getPriority());
        thread1.start();
        thread2.start();
    }
}

class Thread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class Thread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
package no_bugs.practice_7.one_thread_creation;

public class ThreadEx4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from Thread");
            }
        });

        t1.start();
    }
}

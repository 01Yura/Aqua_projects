package no_bugs.practice_7.one_thread_creation;

public class ThreadEx6 {
    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from Thread");
            }
        };

        new Thread(r).start();

    }
}



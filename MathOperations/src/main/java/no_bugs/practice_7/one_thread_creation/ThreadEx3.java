package no_bugs.practice_7.one_thread_creation;

public class ThreadEx3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NewThread2());
        t1.start();

    }
}

class NewThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread");
        }
    }
}



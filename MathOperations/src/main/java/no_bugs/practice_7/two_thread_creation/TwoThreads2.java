package no_bugs.practice_7.two_thread_creation;

public class TwoThreads2 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Thread3());
        Thread t2 = new Thread(new Thread4());

        t1.start();
        t1.join();
        t2.start();

    }

}

class Thread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class Thread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

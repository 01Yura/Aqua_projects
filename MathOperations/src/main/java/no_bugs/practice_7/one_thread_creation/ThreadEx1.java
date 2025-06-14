package no_bugs.practice_7.one_thread_creation;

public class ThreadEx1 extends Thread {
    public static void main(String[] args) {

        ThreadEx1 threadEx1 = new ThreadEx1();
        threadEx1.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread");
        }
    }
}

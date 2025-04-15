package practice_7.one_thread_creation;

public class ThreadEx2 {
    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        t1.start();

    }
}

class NewThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread");
        }
    }
}

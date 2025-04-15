package practice_7.one_thread_creation;

public class ThreadEx7 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();
    }
}

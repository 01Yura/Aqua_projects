package my_tasks.threads.task1_thread_creation;

public class Test3_NewThreadLambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        });

        thread1.start();
    }
}

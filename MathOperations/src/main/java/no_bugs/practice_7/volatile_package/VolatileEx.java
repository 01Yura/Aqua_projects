package no_bugs.practice_7.volatile_package;

public class VolatileEx {
    static long counter;
    static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (flag) {
                counter++;
            }
        });

        t1.start();

        Thread.sleep(2000);
        System.out.println(t1.isAlive());
        flag = false;
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println(t1.isAlive());
        System.out.println(counter);


    }
}

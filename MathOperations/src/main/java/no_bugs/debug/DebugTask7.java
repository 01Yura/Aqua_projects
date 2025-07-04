package no_bugs.debug;

public class DebugTask7 {
    private static int balance = 100;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> withdraw(60)); //100 - 60 = 40 print 40
        Thread t2 = new Thread(() -> withdraw(50)); //100
        t1.start();
        t2.start();
    }

    public static void withdraw(int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            balance -= amount;
            System.out.println("New balance: " + balance);
        }
    }
}

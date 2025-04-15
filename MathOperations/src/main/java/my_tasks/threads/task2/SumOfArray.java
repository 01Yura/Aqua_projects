package my_tasks.threads.task2;

public class SumOfArray {
    public static int sum1;
    public static int sum2;
    public static int sum;
    public static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) throws InterruptedException {
        Runnable calculateFirstSum = () -> {
            for (int i = 0; i < 5; i++) {
                SumOfArray.sum1 += SumOfArray.array[i];

            }
            System.out.println(sum1);
        };

        Runnable calculateSecondSum = () -> {
            for (int i = 5; i < SumOfArray.array.length; i++) {
                SumOfArray.sum2 += SumOfArray.array[i];

            }
            System.out.println(sum2);
        };

        Thread thread1 = new Thread(calculateFirstSum);
        Thread thread2 = new Thread(calculateSecondSum);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(sum = sum1 + sum2);

    }
}

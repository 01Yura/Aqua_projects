package my_tasks.threads.task3;


import java.util.concurrent.*;

public class FindSum {
    public static int sum1;
    public static int sum2;
    public static int sum;
    public static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> calculateFirstSum = () -> {
            for (int i = 0; i < 5; i++) {
                sum1 += array[i];

            }
            System.out.println(sum1);
            return sum1;
        };

        Callable<Integer> calculateSecondSum = () -> {
            for (int i = 5; i < array.length; i++) {
                sum2 += array[i];

            }
            System.out.println(sum2);
            return sum2;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> sum1 = executorService.submit(calculateFirstSum);
        Future<Integer> sum2 = executorService.submit(calculateSecondSum);
        executorService.shutdown();

        sum = sum1.get() + sum2.get();
        System.out.println(sum);
    }
}

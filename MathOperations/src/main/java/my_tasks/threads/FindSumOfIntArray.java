package my_tasks.threads;

import java.util.concurrent.atomic.AtomicLong;

public class FindSumOfIntArray {

    public static long calculateSum(long[] array) throws InterruptedException {
        AtomicLong firstSum = new AtomicLong();
        AtomicLong secondSum = new AtomicLong();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < array.length / 2; i++) {
                firstSum.addAndGet(array[i]);
            }
        });


        Thread t2 = new Thread(() -> {
            for (int i = array.length / 2; i < array.length; i++) {
                secondSum.addAndGet(array[i]);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        return firstSum.get() + secondSum.get();
    }


    public static void main(String[] args) throws InterruptedException {
        long[] array = new long[10_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }


        long start1 = System.nanoTime();
        long sum1 = FindSumOfIntArray.calculateSum(array);
        long end1 = System.nanoTime();
        System.out.println(sum1 + " " + (end1 - start1));

        System.out.println();

        long start2 = System.nanoTime();
        long sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        long end2 = System.nanoTime();
        System.out.println(sum2 + " " + (end2 - start2));
        System.out.println();

        System.out.println((double) (end1 - start1) / (end2 - start2));

        System.out.println(Long.MAX_VALUE);

    }
}

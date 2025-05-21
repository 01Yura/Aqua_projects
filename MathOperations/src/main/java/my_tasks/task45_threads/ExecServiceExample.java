package my_tasks.task45_threads;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecServiceExample implements Callable<Integer> {
    public static AtomicInteger counter = new AtomicInteger(0);

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(counter);
        counter.getAndIncrement();
        return sum;
    }
}

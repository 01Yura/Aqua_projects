package no_bugs.homework_9.task3;

//3. Задача: использование volatile
//Условие задачи: Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.

public class Task3 {
    public static long counter;
    public static volatile boolean flag = true;


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (flag) {
                counter++;
            }
        });

        t1.start();
        Thread.sleep(2000);
        flag = false;

        t1.join();
        System.out.println(counter);


    }


}
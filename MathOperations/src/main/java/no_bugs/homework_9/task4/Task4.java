package no_bugs.homework_9.task4;

//4. Задача: использование synchronized
//Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика. Создайте два потока, каждый из которых вызывает increment() 1000 раз.
//Обеспечьте правильную работу с помощью synchronized.

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Counter.counter);

    }
}

class Counter {
    public static long counter;

    public static synchronized void increment() {
        counter++;
    }
}

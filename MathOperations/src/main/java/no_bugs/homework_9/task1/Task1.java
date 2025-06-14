package no_bugs.homework_9.task1;

//1. Задача: создание одного потока
//Условие задачи: Напишите программу, в которой создается отдельный поток, выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.


public class Task1 {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello from thread");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(task);
        t1.start();

    }
}



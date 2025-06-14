package no_bugs.homework_9.task2;

//2. Задача: создание двух потоков
//Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.

public class Task2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("A"); // лишняя строка
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("A");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("B");  // лишняя строка
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("B");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}

package homework_4;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
//        showNumbers();
//        calculateSum();
        multiplayNumber();
    }

    //   3. Задачи на for
//    Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 3.
//    Реализуйте программу, которая принимает с консоли число n и вычисляет сумму всех чисел от 1 до n (включительно).
//    Создайте программу, которая выводит таблицу умножения для числа, введённого пользователем.
    public static void showNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void calculateSum() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void multiplayNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = 1;
        for (int i = 1; i < 10; i++) {
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }


}

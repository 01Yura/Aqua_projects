package no_bugs.homework_4;

import java.util.Scanner;

public class DoWhileTaskSolver {
    final static String PASSWORD = "qwerty";

    public static void main(String[] args) {
//        checkNumber();
//        checkPassword();
        count();
    }


//    Создайте программу, которая выводит числа от 1 до 10, но использует цикл do-while.

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter the positive number: ");
            number = scanner.nextInt();
        } while (!(number > 0));


    }


    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String password = null;
        do {
            System.out.println("Enter the password: ");
            password = scanner.nextLine();

        } while (!(password.equals(DoWhileTaskSolver.PASSWORD)));

    }

    public static void count() {
        int x = 1;
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 10);
    }


}

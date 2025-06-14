package no_bugs.practice_4;

import java.util.Scanner;

public class forTaskSolver {
    public static void main(String[] args) {
//        returnNumbers();
//        displaySum();
        showMultiplyTable();
    }

    static void returnNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void displaySum() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void showMultiplyTable() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}

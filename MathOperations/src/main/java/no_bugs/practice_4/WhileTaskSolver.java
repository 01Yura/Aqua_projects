package no_bugs.practice_4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
//        calculateFactorial();
//        checkParity();
//        startCountdown();
    }

    static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int i = 1;
        int product = 1;
        while (i <= number) {
            product *= i;
            i++;
        }
        System.out.println(product);
    }

    static void checkParity() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    static void startCountdown() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number > 0) {
            System.out.print(number + " ");
            number--;

        }
    }

}
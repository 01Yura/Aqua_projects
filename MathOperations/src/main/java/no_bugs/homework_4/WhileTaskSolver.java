package no_bugs.homework_4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
//        findFactorial();
//        checkParity();
        backCount();
    }

    public static void findFactorial() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        int result = 1;
        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println(result);

    }

    public static void checkParity() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                i++;
            }
            i++;
        }

    }

    public static void backCount() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number != 0) {
            System.out.print(number + " ");
            number--;
        }
    }


}

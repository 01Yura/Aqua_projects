package practice_4;

import java.util.Scanner;

public class BreakAndContinueTaskSolver {
    public static void main(String[] args) {
//        calculateSum();
//        showAllNumbersExcept();
        showAllTenNumbers();
    }

    static void calculateSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        while (true) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number >= 0) {
                sum += number;
                System.out.println(sum);
            } else {
                break;
            }
        }

    }

    static void showAllNumbersExcept() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }


    static void showAllTenNumbers() {
        int number = 0;
        int count = 0;
        while (true) {
            if (count != 10) {
                if (number % 2 == 0 && number % 5 == 0) {
                    System.out.println(number);
                    number++;
                    count++;
                } else {
                    number++;
                }
            } else {
                break;
            }
        }
    }
}


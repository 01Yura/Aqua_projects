package homework_4;

import java.util.Scanner;

public class BreakAndContinueTaskSolver {
    public static void main(String[] args) {
//        printSum();
//        displayNumbers();
        showFirstTenNumbers();

    }


//    Реализуйте программу, которая выводит первые 10 чисел, которые одновременно делятся на 2 и 5. Используйте break для завершения цикла, когда будет найдено 10 чисел.

    public static void printSum() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        while (true) {
            if (number >= 0) {
                System.out.println("Enter the number: ");
                number = scanner.nextInt();
                sum += number;
                System.out.println("Sum: " + sum);
            } else {
                break;
            }

        }
    }

    public static void displayNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (!(i % 3 == 0)) {
                System.out.println(i);
            } else {
                continue;
            }
        }


    }

    public static void showFirstTenNumbers() {
        int number = 0;
        int counter = 1;
        do {
            while (counter <= 10) {
                if (number % 2 == 0 && number % 5 == 0) {
                    System.out.println(number);
                    number++;
                    counter++;

                } else {
                    number++;
                }
            }
            break;
        } while (true);
    }
}

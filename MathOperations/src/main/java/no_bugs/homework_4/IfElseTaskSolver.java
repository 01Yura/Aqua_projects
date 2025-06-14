package no_bugs.homework_4;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
//        CheckTheNumber();
//        compareTwoNumbers(5, -6);
        checkTheAssessment();

    }

    public static void CheckTheNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println("The number is zero");
        } else {
            System.out.println("The number is negative");
        }
    }

    public static void compareTwoNumbers(int x, int y) {
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }

    public static void checkTheAssessment() {
        Scanner scanner = new Scanner(System.in);
        int assessment = scanner.nextInt();

        if (assessment == 5) {
            System.out.println("Exellent");
        } else if (assessment == 4) {
            System.out.println("Good");
        } else if (assessment == 3) {
            System.out.println("Satisfactory");
        } else {
            System.out.println("Not satisfactory");
        }

    }
}

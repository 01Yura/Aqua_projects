package no_bugs.practice_4;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
//        checkSignOfNumber();
//        printTheBiggestNumber(5, 2);
//        checkAssessment(2);
    }


    static void checkSignOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number > 0) System.out.println("Число положительное");
        else if (number == 0) System.out.println("Число равно нулю");
        else System.out.println("Число отрицательное");
    }

    static void printTheBiggestNumber(int x, int y) {
        if (x > y) System.out.println(x);
        else System.out.println(y);
    }

    static void checkAssessment(int a) {
        if (a == 5) System.out.println("Excellent");
        else if (a == 4) System.out.println("Good");
        else if (a == 3) System.out.println("Satisfactory");
        else System.out.println("Unsatisfactory");
    }


}
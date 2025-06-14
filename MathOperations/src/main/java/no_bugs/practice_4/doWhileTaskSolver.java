package no_bugs.practice_4;

import java.util.Scanner;

public class doWhileTaskSolver {
    public static void main(String[] args) {
//        checkNumber();
//        checkPassword();
        letsCountDown();
    }

    static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Enter the positive number: ");
            number = scanner.nextInt();


        } while (number <= 0);
    }

    static void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = null;
        String actualPassword = "Pa$$word";
        do {
            System.out.println("Enter the password: ");
            password = scanner.nextLine();
        } while (!password.equals(actualPassword));
        System.out.print("Success!");
    }

    static void letsCountDown() {
        int x = 1;
        do {
            System.out.print(x + " ");
            x++;

        } while (x <= 10);
    }
}


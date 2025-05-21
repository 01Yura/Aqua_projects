package my_tasks.task51.scannerwithdowhile;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        printMethodWithDoWhile();
        printMethodWithWhile();
    }

    public static void printMethodWithDoWhile() {
        String input = null;
        do {
            input = scanUserInput();

            if (!input.equals("stop")) {
                System.out.println("You entered: " + input);
            }
        } while (!input.equals("stop"));
    }

    public static void printMethodWithWhile() {
        String input = scanUserInput();

        while (!input.equals("stop")) {
            input = scanUserInput();
        }
    }

    public static String scanUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some string:");
        return scanner.nextLine().toLowerCase();
    }
}
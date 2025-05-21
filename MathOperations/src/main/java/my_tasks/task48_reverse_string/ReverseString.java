package my_tasks.task48_reverse_string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to reverse:");
        String input = (scanner.nextLine());
        String newString = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            char newChars = input.charAt(i);
            newString += newChars;
        }

        System.out.println("Reversed word: " + newString);
    }
}


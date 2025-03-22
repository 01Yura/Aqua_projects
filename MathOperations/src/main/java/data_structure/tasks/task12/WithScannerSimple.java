package data_structure.tasks.task12;

//12. Проверка корректности скобочной последовательности
//Пользователь вводит строку, содержащую скобки. Нужно определить, правильно ли расставлены скобки.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class WithScannerSimple {
    public static void main(String[] args) {
        Deque<String> storage = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);
        String bracket = "";

        while (true) {
            System.out.println("Enter the bracket: ");
            bracket = scanner.nextLine();

            if (bracket.isBlank()) {
                break;
            }

            if (storage.isEmpty()) {
                storage.push(bracket);
            } else if (storage.peek().equals(bracket)) {
                storage.push(bracket);
            } else {
                storage.pop();
            }

        }

        if (storage.isEmpty()) {
            System.out.println("Success! Bracket sequence is correct!");
        } else {
            System.out.println("Fail! Bracket sequence is NOT correct.");
        }
    }
}

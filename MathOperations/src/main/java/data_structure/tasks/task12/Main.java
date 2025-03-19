package data_structure.tasks.task12;

//12. Проверка корректности скобочной последовательности
//Пользователь вводит строку, содержащую скобки. Нужно определить, правильно ли расставлены скобки.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<String> storage = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);
        String bracket = "";

        while (true) {
            System.out.println("Enter the bracket: ");
            bracket = scanner.nextLine();

            if (bracket.equals("stop")) {
                break;
            }

            if (storage.isEmpty()) {
                storage.addLast(bracket);
            } else if (storage.getLast().equals(bracket)) {
                storage.add(bracket);
            } else {
                storage.removeLast();
            }

        }

        if (storage.isEmpty()) {
            System.out.println("Success! Bracket sequence is correct!");
        } else {
            System.out.println("Fail! Bracket sequence is NOT correct.");
        }
    }
}

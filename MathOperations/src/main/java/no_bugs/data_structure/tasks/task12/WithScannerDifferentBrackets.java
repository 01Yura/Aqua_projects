package no_bugs.data_structure.tasks.task12;

import java.util.*;

public class WithScannerDifferentBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        System.out.println("Вводи скобки по одной (ввод 'exit' завершает программу):");

        while (true) {
            System.out.print("Введите скобку: ");
            String next = scanner.nextLine();

            if (next.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            if (next.length() != 1 || "()[]{}".indexOf(next.charAt(0)) == -1) {
                System.out.println("⚠️ Введите только одну допустимую скобку: (, ), [, ], {, }");
                continue;
            }

            char ch = next.charAt(0);
            input.append(ch);

            // Проверка текущей строки
            Deque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;

            for (char c : input.toString().toCharArray()) {
                if (pairs.containsValue(c)) {
                    stack.push(c);
                } else if (pairs.containsKey(c)) {
                    if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                isValid = false;
            }

            System.out.println("Текущая строка: " + input.toString());
            System.out.println("Статус: " + (isValid ? "✅ Валидна" : "❌ Невалидна"));
            System.out.println();
        }
    }
}

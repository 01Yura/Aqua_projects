package no_bugs.data_structure.preparing.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Unique5WebPages {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        Scanner scanner = new Scanner(System.in);
        String webPage = "";
        while (true) {
            System.out.println("Введите адрес web страницы: ");
            webPage = scanner.nextLine();

            if (webPage.isBlank()) {
                System.out.println("Программа завершена");
                break;
            }

            if (linkedHashSet.size() == 5 && !linkedHashSet.contains(webPage)) {
                linkedHashSet.removeFirst();
                linkedHashSet.add(webPage);
            } else {
                linkedHashSet.add(webPage);
            }
            System.out.println("Кеш содержит: " + linkedHashSet);
        }

    }
}

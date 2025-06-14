package no_bugs.homework_6.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Last5UniqueWebPages {
    public static void main(String[] args) {
        LinkedHashSet<String> cache = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        String webSite = "";

        while (true) {
            webSite = scanner.nextLine();

            if (webSite.isBlank()) {
                System.out.println("Program has been finished");
                break;
            }

            if (cache.size() == 5 && !cache.contains(webSite)) {
                cache.removeFirst();
                cache.add(webSite);
            } else {
                cache.add(webSite);
            }
            System.out.println(cache);
        }
    }
}

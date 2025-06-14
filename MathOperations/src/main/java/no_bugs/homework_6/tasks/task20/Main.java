package no_bugs.homework_6.tasks.task20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String data;

        while (true) {
            System.out.println("Print some data: ");
            data = scanner.nextLine();

            if (data.isBlank()) {
                break;
            }

            if (set.add(data)) {
                System.out.println("It is new data");
            } else {
                System.out.println("The data: " + data + " is already in the set");
            }
        }
        System.out.println("The program is finished");

    }

}

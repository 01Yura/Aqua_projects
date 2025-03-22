package data_structure.tasks.task20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> storage = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String element;

        while (true) {
            System.out.println("Enter some number: ");
            element = scanner.nextLine();

            if (element.isBlank()) {
                break;
            }

            if (storage.add(element)) {
                System.out.println("This is a new element");
                System.out.println();
            } else {
                System.out.println("Element " + element + " has already been written");
                System.out.println();
            }

        }
        System.out.println("The program finished");
    }
}

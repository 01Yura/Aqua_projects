package no_bugs.data_structure.preparing.linkedHashMap;

//Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BrowserHystory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        LinkedHashMap<String, String> browserHistory = new LinkedHashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        while (true) {
            input = scanner.nextLine();

            if (input.equals("stop")) {
                System.out.println("Program is over");
                break;
            }

            if (browserHistory.size() < 10) {
                browserHistory.put(input, LocalDateTime.now().format(formatter));
                System.out.println(browserHistory);
            } else if (browserHistory.size() == 10 && browserHistory.containsKey(input)) {
                browserHistory.put(input, LocalDateTime.now().format(formatter));
                System.out.println(browserHistory);
            } else {
                Iterator<Map.Entry<String, String>> iterator = browserHistory.entrySet().iterator();
                iterator.next();
                iterator.remove();
                browserHistory.put(input, LocalDateTime.now().format(formatter));
                System.out.println(browserHistory);


            }
        }

    }
}

package homework_6.linkedHashMap;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String webSite = "";

        LinkedHashMap<String, LocalDateTime> browserHistory = new LinkedHashMap<>();

        while (true) {

            webSite = scanner.nextLine();

            if (webSite.isBlank()) {
                System.out.println("Program is over");
                break;
            }

            if (browserHistory.size() < 10) {
                browserHistory.put(webSite, LocalDateTime.now());
                System.out.println(browserHistory);
            } else if (browserHistory.size() == 10 && browserHistory.containsKey(webSite)) {
                browserHistory.put(webSite, LocalDateTime.now());
                System.out.println(browserHistory);
            } else {
                Iterator iterator = browserHistory.entrySet().iterator();
                iterator.next();
                iterator.remove();
                browserHistory.put(webSite, LocalDateTime.now());
                System.out.println(browserHistory);
            }


        }

    }
}

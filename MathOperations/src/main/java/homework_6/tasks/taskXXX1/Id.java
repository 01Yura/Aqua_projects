package homework_6.tasks.taskXXX1;

import java.util.Collections;
import java.util.HashSet;

public class Id {
    public static void main(String[] args) {
        HashSet<Integer> ids = new HashSet<>();

        Collections.addAll(ids, 1, 3, 5, 7, 9, 2, 4, 6, 8);
        System.out.println(ids);

        System.out.println(ids.contains(3));
        System.out.println(ids.contains(11));
    }
}

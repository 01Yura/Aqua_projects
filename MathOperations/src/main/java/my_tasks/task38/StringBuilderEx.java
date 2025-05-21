package my_tasks.task38;

import java.util.HashSet;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.append(" world"));

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
    }
}

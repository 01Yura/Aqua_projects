package no_bugs.homework_6.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TheLongestString {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Hello", "OK", "Good morning", "Bay");

        String longestString = strings.get(0);

        for (String string : strings) {
            if (longestString.length() < string.length()) {
                longestString = string;
            }
        }
        System.out.println(longestString);
    }
}

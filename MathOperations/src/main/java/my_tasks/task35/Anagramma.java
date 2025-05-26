package my_tasks.task35;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Anagramma {
    public static void main(String[] args) {
        System.out.println(isAnagramm("FDSA", "dsfa"));

        int[] array = new int[5];
        
    }


    public static boolean isAnagramm(String s1, String s2) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (char c : s1.toLowerCase().toCharArray()) {
            list1.add(c);
        }

        for (char c : s2.toLowerCase().toCharArray()) {
            list2.add(c);
        }

        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());

        return list1.equals(list2);
    }
}
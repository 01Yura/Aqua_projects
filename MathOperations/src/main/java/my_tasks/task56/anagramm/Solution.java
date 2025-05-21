package my_tasks.task56.anagramm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = List.of("listen", "silent", "enlist", "google", "gogole");
        System.out.println(groupAnagrams(list));
    }

    public static List<List<String>> groupAnagrams(List<String> words) {
        List<List<String>> listOfAnagrams = new ArrayList<>();
        int count = 0;

        for (String word : words) {
            char[] array1 = word.toCharArray();
            Arrays.sort(array1);
            listOfAnagrams.add(new ArrayList<>());

            for (String string : words) {
                char[] array2 = string.toCharArray();
                Arrays.sort(array2);


                if (Arrays.equals(array1, array2)) {
                    listOfAnagrams.get(count).add(string);
                }
            }
            count++;
        }

        return listOfAnagrams.stream().distinct().toList();

    }
}

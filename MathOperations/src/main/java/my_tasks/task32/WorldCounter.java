package my_tasks.task32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class WorldCounter {
    public static void main(String[] args) {
        String sentence = "Hello my friend, hello - again friend";

        sentence = sentence.toLowerCase();
        System.out.println(sentence);

        sentence = sentence.replaceAll("[,-]", " ");
        System.out.println(sentence);

        String[] words = sentence.split("[\\s]+");
        System.out.println("Array: " + Arrays.toString(words));

        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        System.out.println("List: " + list);

        HashMap<String, Integer> map = new HashMap<>();

        long timeStart1 = System.nanoTime();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int counter = 0;
            for (int j = 0; j < words.length; j++) {
                if (word.equals(words[j])) {
                    counter++;
                }
                map.put(word, counter);

            }
        }
        long timeEnd1 = System.nanoTime();
        long time1 = timeEnd1 - timeStart1;

        long timeStart2 = System.nanoTime();
        for (String s : list) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }
        long timeEnd2 = System.nanoTime();
        long time2 = timeEnd2 - timeStart2;


//        map.entrySet().forEach(System.out::println);
        System.out.println(time1);
        System.out.println(time2);
    }
}

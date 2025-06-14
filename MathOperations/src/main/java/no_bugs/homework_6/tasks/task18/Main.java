package no_bugs.homework_6.tasks.task18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Земля в иллюминаторе, земля в иллюминаторе,\n" + "Земля в иллюминаторе видна...\n" + "Как сын грyстит о матери, как сын грyстит о матери,\n" + "Грyстим мы о земле - она одна.\n" + "А звезды тем не менее, а звезды тем не менее чyть ближе,\n" + "Но все также холодны.\n" + "И, как в часы затмения, и, как в часы затмения ждем света\n" + "И земные видим сны.\n" + "\n" + "И снится нам не рокот космодрома,\n" + "эта ледяная синева,\n" + "А снится нам трава, трава y дома,\n" + "Зеленая, зеленая трава.\n";

        text = text.toLowerCase();
        System.out.println(text);

        text = text.replaceAll("[.,-]+", "");
        System.out.println(text);

        String[] words = text.split("\\s+");
        System.out.println(Arrays.toString(words));

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.putIfAbsent(words[i], 1);
            map.put(words[i], map.get(words[i]) + 1);
        }

        map.entrySet().forEach(System.out::println);

    }
}

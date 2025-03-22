package homework_6.tasks.task14;

import java.util.Arrays;
import java.util.HashSet;

public class TaskOfUniqueElements {
    public static void main(String[] args) {
        String text = "Земля в иллюминаторе, земля в иллюминаторе,\n" + "Земля в иллюминаторе видна...\n" + "Как сын грyстит о матери, как сын грyстит о матери,\n" + "Грyстим мы о земле - она одна.\n" + "А звезды тем не менее, а звезды тем не менее чyть ближе,\n" + "Но все также холодны.\n" + "И, как в часы затмения, и, как в часы затмения ждем света\n" + "И земные видим сны.\n" + "\n" + "И снится нам не рокот космодрома,\n" + "эта ледяная синева,\n" + "А снится нам трава, трава y дома,\n" + "Зеленая, зеленая трава.";


        text = text.toLowerCase();
        text = text.replaceAll("[.,-]+", "");
        String[] words = text.split("\\s+");

        System.out.println(Arrays.toString(words));

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            hashSet.add(words[i]);
        }

        System.out.println(hashSet);

        System.out.println(hashSet.size());

    }
}

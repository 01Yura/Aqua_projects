package data_structure.tasks.task14;

import java.util.HashSet;
import java.util.Set;

//14. Уникальные слова в тексте
//        Дан текст, нужно сохранить все уникальные слова и определить их количество.

public class Main {
    public static void main(String[] args) {
//        Create storage
        Set<String> storage = new HashSet<>();
//        Store text to the variable
        String text = "Земля в иллюминаторе, земля в иллюминаторе,\n" +
                "Земля в иллюминаторе видна...\n" +
                "Как сын грyстит о матери, как сын грyстит о матери,\n" +
                "Грyстим мы о земле - она одна.\n" +
                "А звезды тем не менее, а звезды тем не менее чyть ближе,\n" +
                "Но все также холодны.\n" +
                "И, как в часы затмения, и, как в часы затмения ждем света\n" +
                "И земные видим сны.\n" +
                "\n" +
                "И снится нам не рокот космодрома,\n" +
                "эта ледяная синева,\n" +
                "А снится нам трава, трава y дома,\n" +
                "Зеленая, зеленая трава.\n";
//        Convert all words in the text to ljwercase
        text = text.toLowerCase();
//        Delete all periods, commas and dashes
        text = text.replaceAll("[.,-]+", "");
//        Add all words in the array spliting (spaces)
        String[] words = text.split("\\s+");


//        Collections.addAll(storage, words);
//        Add each word from array to hashSet (only unique bcs of hashSet)
        for (String element : words) {
            storage.add(element);
        }
//        Print hashSet
        storage.forEach(System.out::println);
        System.out.println();
//        Count number of words in hashSet
        System.out.println("Number of unique words: " + storage.size());
    }
}

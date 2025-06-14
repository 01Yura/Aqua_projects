package no_bugs.data_structure.tasks.task14;

import java.util.HashSet;
import java.util.Set;

//14. Уникальные слова в тексте
//        Дан текст, нужно сохранить все уникальные слова и определить их количество.

public class Main {
    public static void main(String[] args) {
//        Create storage
        Set<String> storage = new HashSet<>();
//        Store text to the variable
        String text = "Земля в иллюминаторе\n" +
                "Земля в иллюминаторе\n" +
                "Земля в иллюминаторе видна\n" +
                "Как сын грустит о матери\n" +
                "Как сын грустит о матери\n" +
                "Грустим мы о Земле, она одна\n" +
                "А звёзды тем не менее\n" +
                "А звёзды тем не менее\n" +
                "Чуть ближе, но всё так же холодны\n" +
                "И как в часы затмения\n" +
                "И как в часы затмения\n" +
                "Ждём света и земные видим сны\n" +
                "И снится нам не рокот космодрома\n" +
                "Не эта ледяная синева\n" +
                "А снится нам трава, трава у дома\n" +
                "Зелёная, зелёная трава";
//        Convert all words in the text to lowercase
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

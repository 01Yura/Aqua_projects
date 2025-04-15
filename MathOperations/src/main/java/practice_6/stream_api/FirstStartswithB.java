package practice_6.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Задача 4: Поиск первого элемента, начинающегося на "Б"

public class FirstStartswithB {
    public static void main(String[] args) {
        String str = "Hello, my bame is Bubakar Kumar. I am a BA Engineer at Boogle bompany.";
        String[] array = str.replaceAll("[\\s,.]+", " ").split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println();

        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

        String str2 = list.stream()
                .filter(element -> element.startsWith("B"))
                .findFirst().get();
        System.out.println(str2);
    }
}

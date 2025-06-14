package no_bugs.data_structure.tasks.task18;

//18. Анализ частоты слов
//        Требуется определить, сколько раз каждое слово встречается в тексте.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> storage = new HashMap<>();

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

        text = text.replaceAll("[.,-]+", "");
        text = text.toLowerCase();

        String[] words = text.split("\\s+");
        System.out.println(Arrays.toString(words));

/*      Важно!!!
        Этой строчкой - storage.putIfAbsent(element, 1); - добавляю ключ и значение, но только в том случае если ключа нет, если ключ есть, то ничего не делаю.
        Затем добавляю ключ и значение, но так как ключ есть, то просто обновляю значение, но не просто обновляю, а сначала получаю командой - storage.get(element) -
        она возвращает значение по ключу и прибавляю к значению 1 и уже его записываю как обновленное значение
 */
        for (String element : words) {
            storage.putIfAbsent(element, 1);
            storage.put(element, storage.get(element) + 1);
        }

        storage.entrySet().forEach(System.out::println);
    }

}

package my_tasks.task57_count_letter;

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(compress(s));
    }

    public static String compress(String string) {
        char[] array = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : array) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            stringBuilder.append(entry.getKey());
            if (entry.getValue() > 1) {
                stringBuilder.append(entry.getValue());
            }
        }
        
        return stringBuilder.toString();
    }
}

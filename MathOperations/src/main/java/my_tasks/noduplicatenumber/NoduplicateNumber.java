package my_tasks.noduplicatenumber;

import java.util.HashMap;
import java.util.Map;

public class NoduplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 3, 2, 4, 1, 3, 2, 1};
        System.out.println(findNoDuplicateNumber(numbers));
    }

    public static int findNoDuplicateNumber(int[] array) {
        HashMap<Integer, Integer> duplicates = new HashMap<>();
        for (int element : array) {
            duplicates.putIfAbsent(element, 0);
            duplicates.put(element, duplicates.get(element) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}

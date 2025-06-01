package want_offer.easy_leetcode.find_two_numbers_in_array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTwoNumbersEx {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 2, 9, 4, 6, 9, 2, 5, 0, 5, 8, 1, 19};
        System.out.println(findTwoNumbers(array, 1120));
    }

    public static List<Integer> findTwoNumbers(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return List.of(i, j);
                }
            }
        }

        return null;
    }

    //    еще решение странное
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

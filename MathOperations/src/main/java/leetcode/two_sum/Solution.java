package leetcode.two_sum;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {3, 2, 4};
        int[] result = twoSum(array, 6);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int index = i;

            for (int j = 0; j < nums.length; j++) {
                if (first + nums[j] == target && index != j) {
                    return new int[]{index, j};
                }
            }
        }
        return new int[]{};
    }
}

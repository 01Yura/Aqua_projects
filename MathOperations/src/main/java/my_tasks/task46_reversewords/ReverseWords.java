package my_tasks.task46_reversewords;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "ollhe";

        System.out.println("isReverse(s1, s2) = " + isReverse(s1, s2));
        System.out.println("isAnagram(s1, s2) = " + isAnagram(s1, s2));

    }

    public static boolean isReverse(String s1, String s2) {
        StringBuilder stringBuilder = new StringBuilder(s1);
        String finanString = stringBuilder.reverse().toString();
        return finanString.equalsIgnoreCase(s2);
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] array1 = s1.toLowerCase().toCharArray();
        Arrays.sort(array1);

        char[] array2 = s2.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}

package my_tasks.interwiews.countvowels;

public class CountVowelsEx {
    public static void main(String[] args) {
        System.out.println(countVowels("Hello my friends"));
    }

    public static int countVowels(String string) {
        char[] array = string.toCharArray();
        int count = 0;
        for (char c : array) {
            if (c == 'e' || c == 'u' || c == 'i' || c == 'o' || c == 'a') {
                count++;
            }
        }
        return count;
    }
}

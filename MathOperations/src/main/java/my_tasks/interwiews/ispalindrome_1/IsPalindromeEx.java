package my_tasks.interwiews.ispalindrome_1;

public class IsPalindromeEx {
    public static void main(String[] args) {
        System.out.println("isPalindrome(\"abba\") = " + isPalindrome("abba"));
        System.out.println("isPalindrome(\"ab\") = " + isPalindrome("ab"));
        System.out.println("isPalindrome(\" \") = " + isPalindrome(" "));
        String s = "Hello";
        System.out.println(s.indexOf('o'));

    }

    public static boolean isPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());
        String reversedString = stringBuilder.reverse().toString();
        return string.equals(reversedString);
    }
}

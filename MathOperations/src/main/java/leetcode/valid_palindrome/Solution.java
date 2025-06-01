package leetcode.valid_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }
}

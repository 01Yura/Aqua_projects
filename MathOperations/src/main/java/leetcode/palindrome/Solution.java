package leetcode.palindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        String string1 = String.valueOf(x);
        StringBuilder string2 = new StringBuilder(string1);
        String string3 = string2.reverse().toString();

        return string1.equals(string3);
        
    }
}

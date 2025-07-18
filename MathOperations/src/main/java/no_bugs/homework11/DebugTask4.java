package no_bugs.homework11;

//Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            System.out.println("null is not a String!!!");
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}


package my_tasks.task59.ispalindrome;

public class PalindromeExample {
    public static boolean isPalinrome(String input) {
        String string = PalindromeExample.cleanString(input);
        String reversedString = new StringBuilder(string).reverse().toString();

        return string.equalsIgnoreCase(reversedString);
    }

    public static String cleanString(String input) {
        String clenedString = input.toLowerCase().replaceAll("[\\W]+", "");
        return clenedString;
    }


    public static void main(String[] args) {
        String string = "1aS,.df  fD                                         ,:sa 1 ";
        System.out.println(isPalinrome(string));
    }
}

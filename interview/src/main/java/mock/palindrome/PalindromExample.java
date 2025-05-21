package mock.palindrome;

public class PalindromExample {
    public static void main(String[] args) {
        int num1 = 1001;
        int num2 = 1002;
        int num3 = 1;
        int num4 = -1001;
        int num5 = -1002;
        int num6 = Integer.MIN_VALUE;
        int num7 = Integer.MAX_VALUE;
        int num8 = 0;
        int num9 = 'b';

        System.out.println(isPalindrome(num1));
        System.out.println(isPalindrome(num2));
        System.out.println(isPalindrome(num3));
        System.out.println(isPalindrome(num4));
        System.out.println(isPalindrome(num5));
        System.out.println(isPalindrome(num6));
        System.out.println(isPalindrome(num7));
        System.out.println(isPalindrome(num8));
        System.out.println(isPalindrome(num9));

    }


    public static boolean isPalindrome(int number) {
        if (number<0){
            number*=-1;
        }

        String s1 = Integer.toString(number);
        StringBuilder stringBuilder = new StringBuilder(s1);
        String reversedString = stringBuilder.reverse().toString();
        return s1.equals(reversedString);
    }
}

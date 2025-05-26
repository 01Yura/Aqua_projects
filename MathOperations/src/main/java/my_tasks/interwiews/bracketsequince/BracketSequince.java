package my_tasks.interwiews.bracketsequince;

import java.util.ArrayDeque;
import java.util.HashMap;

public class BracketSequince {
    public static void main(String[] args) {
        System.out.println(isValidBracketSequince("(({}))"));
        System.out.println(isValidBracketSequince("{}"));
        System.out.println(isValidBracketSequince("()("));
        System.out.println(isValidBracketSequince("))"));
        System.out.println(isValidBracketSequince("(("));
        System.out.println(isValidBracketSequince(")("));
    }

    public static boolean isValidBracketSequince(String brackets) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        char[] array = brackets.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char bracket : array) {
            if (map.containsValue(bracket)) {
                stack.push(bracket);
            } else if (map.containsKey(bracket)) {
                if (stack.isEmpty() || stack.pop() != map.get(bracket)) return false;
            }
        }
        return stack.isEmpty();

    }

}

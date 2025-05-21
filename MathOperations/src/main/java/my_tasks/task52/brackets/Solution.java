package my_tasks.task52.brackets;

import java.util.Map;
import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] array = s.toCharArray();
        for (char ch : array) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char bracket = stack.peek();
                if ((bracket == '(' && ch == ')') || (bracket == '[' && ch == ']') || (bracket == '{' && ch == '}')) {
                    stack.pop();
                } else return false;

            }
        }

        return (stack.isEmpty());
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = Map.of(
                ')', '(',
                ']', '[',
                '}', '{'
        );

        for (char c : s.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty()) return false;


                if (stack.peek() == brackets.get(c)) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();

    }


    public static void main(String[] args) {

        System.out.println(isValid("()"));         // true
        System.out.println(isValid("(())"));       // true
        System.out.println(isValid("()()"));       // true
        System.out.println(isValid("(()())"));     // true
        System.out.println(isValid("(((())))"));   // true
        System.out.println();

        // ❌ Неправильные
        System.out.println(isValid("("));          // false
        System.out.println(isValid(")"));          // false
        System.out.println(isValid("(()"));        // false
        System.out.println(isValid("())("));       // false
        System.out.println(isValid(")()("));       // false
        System.out.println(isValid("(])"));        // false

    }
}

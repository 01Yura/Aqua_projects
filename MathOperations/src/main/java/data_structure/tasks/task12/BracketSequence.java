package data_structure.tasks.task12;

import java.util.Stack;

public class BracketSequence {
    public static void main(String[] args) {
        String s1 = "([{}])"; //true
        String s2 = "([{}]"; //false
        String s3 = "(}])"; //false
        String s4 = "}[{}])"; //false
        String s5 = "([{}])("; //false
        String s6 = "([{}])()"; //true
        String s7 = ""; //false
        String s8 = "  "; //false

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
        System.out.println(isValid(s5));
        System.out.println(isValid(s6));
        System.out.println(isValid(s7));
        System.out.println(isValid(s8));
    }


    public static boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        char[] array = string.toCharArray();

        if (array.length == 0) return false;

        char top = '\u0000';
        for (char ch : array) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    top = stack.pop();
                    if ((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']')) {
                        continue;
                    } else return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

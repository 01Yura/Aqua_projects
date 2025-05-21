package data_structure.tasks.task12;

import java.util.ArrayDeque;
import java.util.HashMap;

public class TestBrackets {

    public static boolean checkBracketSequence(String string) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        map.put('>', '<');

        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] array = string.toCharArray();

        boolean isValid = true;

        for (char ch : array) {
            if (map.containsValue(ch)) {
                stack.push(ch);
            } else if (map.containsKey(ch)) {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }

                char lastBracket = stack.pop();
                char expectedBracket = map.get(ch);

                if (lastBracket == expectedBracket) {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid && stack.isEmpty()) {
            isValid = true;
        } else {
            isValid = false;
        }

        return isValid;


    }

    public static void main(String[] args) {

        System.out.println(checkBracketSequence("([{}])"));
        System.out.println(checkBracketSequence("([[{}])"));
        System.out.println(checkBracketSequence("([{}]))"));

    }
}

package no_bugs.tests.voweltest;

public class VowelClass {
    public static void main(String[] args) {
        System.out.println(methodX("Hello pediki"));
    }


    public static int methodX(String string) {
        string = string.toLowerCase();
        int count = 0;
        for (var character : string.toCharArray()) {
            if (character == 'a' || character == 'e' || character == 'u' || character == 'i' || character == 'o') {
                count++;
            }
        }
        return count;
    }


    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
